/*
 Program:Create a program for calculation.read three values from the user for operation
 first and second values as operands.
 third value as operator.
 if user press1 => print addition of first and second
 if user press2 => print subtraction of first and second
 if user press3 => print multiplication of first and second
 if user press4 => print division of first and second
  @author:Archana Jha
  @date: 29th sept 2022
 */
package com.src;

import java.util.Scanner;

class Calculation {
    public static void main(String[] args)
    {
    	//taking input from the user
    	//creating scanner class
    	
    	Scanner sc=new Scanner(System.in);
    	int a,b;
    	char operator;
    	
    	System.out.println("Enter A:");
    	a=sc.nextInt();
    	
    	System.out.println("Enter B:");
    	b=sc.nextInt();
    	
    	System.out.println("Enter operators(+,-,*,/)");
    	operator=sc.next().charAt((0));
    	
    	double addition=a+b;
    	double subtraction=a-b;
    	double multiplication=a*b;
    	double division=a/b;
    	
    	//using switch and break operation
    	switch(operator)
    	{
    	// 
    	case'+':
    	{
    		//for addition operator
    		System.out.println("Total after addition is:"+addition);
    		break;
    	}
    	case'-':
    	{
    		//for subtraction operator
    		System.out.println("Total after subtraction:"+subtraction);
    		break;
    		}
    	case'*':
    	{
    		//for multiplication operator
		System.out.println("Total after multiplication is:"+multiplication);
          break;
    	}
    	case'/':
    	{
    		//for division operator
		System.out.println("Total after division is:"+division);
        break;
    }
    	default:
    	{
    		// for select the operator
		System.out.println("Please select proper operator");
		return;

}
    }
}
}
