/*Program: Take input of age of 3 people by user and determine oldest and youngest among them.
@Author: Raunak Raj
@Date: 20/10/2022
 */
 //Import Scanner Class
 import java.util.Scanner;
 
 //Create class
 class AgeCheck
 {
	 //Calling Method
	 static void ageCheckerOldest(int p1,int p2,int p3)//This method returns the value of oldest person
	 {
		 if((p1>p2)&&(p1>p3))
			 System.out.println("1st Person is oldest and it's age is "+p1);
		 else if(p2>p3)
			 System.out.println("2nd Person is oldest and it's age is "+p2);
		 else
			 System.out.println("3rd Person is oldest and it's age is "+p3);
	 }//end of method
	 
	 //Calling Method
	 static void ageCheckerYoungest(int p4,int p5,int p6)//This method returns the value of youngest person
	 {
		 if((p4<p5)&&(p4<p6))
			 System.out.println("1st Person is youngest and it's age is "+p4);
		 else if(p5<p6)
			 System.out.println("2nd Person is youngest and it's age is "+p5);
		 else
			 System.out.println("3rd Person is youngest and it's age is "+p6);
	 }//end of method
	 
	 //Main Method
	 public static void main(String args[])
	 {
		 //Creating Scanner Class Object
		 Scanner sc=new Scanner(System.in);
		 int person1,person2,person3;
		 System.out.println("Enter the age 3 peoples:");
		 person1=sc.nextInt();
		 person2=sc.nextInt();
		 person3=sc.nextInt();
		 ageCheckerOldest(person1,person2,person3);
		 ageCheckerYoungest(person1,person2,person3);
		 
		 
	 }//End of Main Method
 }//End of Class