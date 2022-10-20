/*Program: WAP to find the 
1.square
2. cube 
3. check number is even or odd using switch case."
@Author: Raunak Raj
@Date: 20/10/2022
 */
 //Import Scanner Class
 import java.util.Scanner;
 
 //Create class
 class MenuSquareCubeOddeven
 {
	 //Calling Method
	 static void CalcSquare(int num1)
	 {
		System.out.println("Square of a no.: "+(num1*num1));
	 }//end of method
	 
	 //Calling Method
	 static void CalcCube(int num2)
	 {
		 System.out.println("Cube of a no.: "+(num2*num2*num2));
	 }//end of method
	 
	  //Calling Method
	 static void OddEven(int num3)
	 {
		 if(num3%2==0)
			 System.out.println("No. is Even: "+(num3));
		 else
			 System.out.println("No. is Odd: "+(num3));
	 }//end of method
	 
	 //Main Method
	 public static void main(String args[])
	 {
		 //Creating Scanner Class Object
		 Scanner sc=new Scanner(System.in);
		 int num,n;
		 System.out.println("Enter a no.: ");
		 num=sc.nextInt();
		 System.out.println("Choose the option for operation:");
		 System.out.println(" 1: Square \n 2: Cube \n 3: Check the no. is odd or even");
		 n=sc.nextInt();
		 
		 //Creating Switch Case
		 switch(n)
		 {
			 case 1: CalcSquare(num);
				break;
			 case 2: CalcCube(num);
				break;
			 case 3: OddEven(num);
				break;
			default: System.out.println("Invalid Choice");
		 }//End of switch case
		 
		 
		 
		 
		 
	 }//End of Main Method
 }//End of Class