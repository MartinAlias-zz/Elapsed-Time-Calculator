/*
 *Programmed By: Martin Horciak, Justin Sousa, Teague Wingfelder
 *Programmed For: Mr.L.Calomeni
 *Course: ICS201
 *Date: Wednesday, January 11, 2017.
 *Program Description:	Create an application that prompts the user for a starting hour(am or pm)
 *						and for the amount of hours elapsed. Then the appplication should display
 *						the time after those hours have passed (am or pm).
 */

 import java.util.Scanner;							//Import Scanner package
 import java.lang.String;							//Import String package

 class ElapsedTimeCalculator{						//Class decloration w/ opeing and closing brace
 	public static void main (String [] args){		//Main method w/ opening and closing brace

 		int starting, elapsed, total;				//Int variable decloration
 		String ampm;								//String variable decloration
 		Scanner input = new Scanner(System.in);		//Creation of scanner

 		System.out.print ("Enter the starting hour: ");		//System output for starting hours
 		starting = input.nextInt();							//user input

 		System.out.print ("am or pm: ");					//System output for am/pm
 		ampm = input.next();								//user input

 		System.out.print ("Enter the number of elapsed hours: ");	//System output for elapsed hours
 		elapsed = input.nextInt();									//user input

 		total = starting + elapsed;							//total hours calculation

 		if (ampm.compareToIgnoreCase("am") ==0){			//If statement w/ compareTo string and condition for am
 			while (total > 24) {							//While statement with condition
 				total= total-24;							//Calculation
 			}
			if (total > 12){								//Nested If statement with condition
				total= total-12;							//Calculation
				System.out.println ("The time is: " + total + ":00 pm");	//System output (pm)
			}else if (total <= 12){											//Else If statement with condition
				System.out.println ("The time is: " + total + ":00 am");	//System output (am)
			}
 		}else if (ampm.compareToIgnoreCase("pm") ==0){		//Else If statemetn w/ compareTo string and condition for pm
			total= total+12;								//Calculation
			while (total > 24) {							//While statement
				total= total-24;							//Calculation
			}
			if (total > 12){								//If statement with condition
				total= total-12;							//Calculation
				System.out.println ("The time is: " + total + ":00 pm");		//System output (pm)
			}else if (total <= 12){												//Else If with condition
				System.out.println ("The time is: " + total + ":00 am");		//System output (am)
			}
		}else {																	//Else statement
			System.out.println ("Error - Please enter am, or pm");				//System output for error
		}
		input.close();										//Scanner Close
 	}
 }