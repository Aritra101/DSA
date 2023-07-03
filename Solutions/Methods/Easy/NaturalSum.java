package com.aritra;

import java.util.*;
public class NaturalSum
{
	public static void main(String[] args) {
	    int n;
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the number: ");
	    n = sc.nextInt();
	    naturalsum(n);
        
	}
	public static int naturalsum(int natural){
        int sum = 0;
        for(int i=1;i<=natural;i++)
            sum +=i;
        System.out.println("The sum of natural numbers till "+natural+" is "+sum);
        return sum;
	}
}
