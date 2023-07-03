package com.aritra;

import java.util.*;
public class Vote
{
	public static void main(String[] args) {
	    int age;
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter your age: ");
	    age= sc.nextInt();
	    vote(age);
	}
	public static void vote(int age){
		    if(age>18)
		        System.out.println("You are eligible to cast vote :)");
		    else
		        System.out.println("You are not eligible to cast vote, first turn 18 :(");
	}
}
