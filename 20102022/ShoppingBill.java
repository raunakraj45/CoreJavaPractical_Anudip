/*Program:  WAP to give 10% discount to the user whose shopping bill id greater than 2000.(ask the qty , cost of one unit is 540)
@Author: Raunak Raj
@Date: 20/10/2022
 */
 //import Scanner class
 import java.util.Scanner;
 
 //Create Class
 class ShoppingBill
 {
	 //Method Calling
	 static void Bill(int u)
	 {
		 int total;
		 total=u*540;
		 if(total>=2000)
			 System.out.println("You've discounted 10% and your bill is "+(total-(0.1*total)));//bill with 20% discount
		 else
			 System.out.println("Your bill is "+(total));//bill with no discount
	 } //Method End
	 
	 //Main Method
	 public static void main(String args[])
	 {
		 //Scanner class object 
		 Scanner sc=new Scanner(System.in);
		 int unit;
		 System.out.println("Enter no. of units you purchased from shop:");
		 unit=sc.nextInt();
		 Bill(unit);
	 }//Main method ends
 }// Class Ends