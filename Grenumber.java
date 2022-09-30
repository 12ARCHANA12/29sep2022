package com.src;
/*
 Program: program to find largest of two numbers.
 @author:Archana Jha
 @date: 29th sept 2022
 */
import java.util.Scanner;

public class Grenumber 
      {
	   public static void main(String[] args)
	   {	
		   //taking input from the user
		   //creating scanner class
			Scanner sc=new Scanner(System.in);
			
        System.out.println("Enter first number");
        //taking value of first number from the user
        int num1=sc.nextInt();
        
        System.out.println("Enter second number");
        //taking value of second number from the user
        int num2=sc.nextInt();
        // find the greater number
        
		if(num1>num2)
		{
			System.out.println("The largest number="+num1);
		}
		else
		{
			System.out.println("The the largest number="+num2);
		}

      }
      }
	   
	   
