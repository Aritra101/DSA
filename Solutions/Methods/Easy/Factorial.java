package com.aritra;

import java.util.*;
public class Factorial
 {
   public static void main (String[]args)
   {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter a number::");
     int num = sc.nextInt();
     int fact = factorial(num);
       System.out.println("The factorial of "+num+" is: "+fact);


   }
   public static int factorial(int n){
       int i = n, fact=1;
       for(i=n;i>=1;i--){
           fact = fact * i ;
       }
       return fact;
   }
 }