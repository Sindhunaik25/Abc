package com.arpita.oops;
import java.util.*;

public class Calculation {
	
	public void  add(double num1,double num2)
	{   double num3;
	    num3=num1+num2;
	    System.out.println("The Addition is: "+num3);
	    
	}
	
	public void subtract(double num1,double num2)
	{   double num3;
	    num3=num1-num2;
	    System.out.println("The Subtraction is: "+num3);
	    
	}
	
	public void  multiplication(double num1,double num2)
	{   double num3;
	    num3=num1*num2;
	    System.out.println("The multiplication is: "+num3);
	    
	}
	
	public void  division(double num1,double num2)
	{   double num3;
	    num3=num1/num2;
	    System.out.println("The division is: "+num3);
	    
	}
   public double subtraction(double n1,double n2)
   {
	   return n1+n2;
   }
  
   public static void main(String args[]) {
    Calculation calculation=new Calculation();
    System.out.println("Enter the Two numbers");
    Scanner ac=new Scanner(System.in);
    double num1=ac.nextDouble();
    double num2=ac.nextDouble();
    calculation.add(num1, num2);
    calculation.subtract(num1, num2);
    calculation.multiplication(num1,num2);
    calculation.division(num1,num2);
   }
}
