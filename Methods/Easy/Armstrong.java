package com.aritra;
import java.util.*;

public class Armstrong
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
// 		System.out.println("Hello World");
        System.out.print("Enter a number::");
        int n = sc.nextInt();
        armstrong(n);
	}
	public static void armstrong(int n){
        int rem,count=0,result=0;
        int temp = n,temp2=n;
        while(temp!=0){
            temp=temp/10;
            count++;
        }
        temp2 = n;
        while(temp2!=0){
            rem = temp2%10;
            result += Math.pow(rem,count);
            temp2=temp2/10;
        }
        if (result==n)
            System.out.printf("%d is a armstrong number",n);
        else
            System.out.printf("%d is not a armstrong number",n);
        
}
}
