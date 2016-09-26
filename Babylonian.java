//Class for my Program
import java.util.*;
public class Babylonian
{
   //Variable for the guess answer
   private static double GAnswer;
   private static double number;
   private static double SQrt;
   private static double Errordown;
   private static double Errorup;

//The recursion method
public double RecursiveMethod()
{
//Recursion 
  if(GAnswer < Errorup && GAnswer > Errordown)
{
     return GAnswer;
}
//If GAnswer isnt correct
  else
{
     GAnswer = (GAnswer + (number/GAnswer)) /2;
     return RecursiveMethod();
}
}
//constructor for the babylonian method
public Babylonian(double num)
{
    //Assigning number to num
    number = num;
    //Testing the guess method
    GAnswer = number / 2;
    //calculating the exact answer
    SQrt = Math.sqrt(number);  
    //testing the mragin of error upper boundary
    Errorup = SQrt + 0.00001;  
    //testing the margin of error lower boundary
    Errordown = SQrt - 0.00001; 
    //calling the recursion method
    RecursiveMethod();
} 
//Main method
public static void main(String[] args)
{
//Making variable for the user to input
double userInput;
//Scanner for main
Scanner a = new Scanner(System.in);
//Print out and ask user to assign a number
System.out.print("Enter a number: ");
//Takes the value you assigned and uses it
userInput = a.nextDouble();
Babylonian f = new Babylonian(userInput);
System.out.println(SQrt);
System.out.println(GAnswer);
}

}