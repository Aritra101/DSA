package com.aritra;

import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Approach 1 through String
        int n, x,i,count=0;
        String s;
        char s2;
        System.out.print("Enter a number::");
        n= sc.nextInt();
        System.out.print("Enter the digit for which you want to count occurrence::");
        x= sc.nextInt();
        s= Integer.toString(n);
        s2= Integer.toString(x).trim().charAt(0);
        for(i=0;i<s.length();i++){
            if(s.charAt(i)==s2)
                count++;
        }
        if(count>0)
            System.out.println("The number of occurrences are: "+count);
        else
            System.out.println("No such value found!!!"); */
        int n,rem,c=0,x;
        System.out.print("Enter the number::");
        n= sc.nextInt();
        System.out.print("Enter the digit for which you want to count occurrence::");
        x= sc.nextInt();
        while(n>0){
            rem = n%10;
            if (rem==x)
                c++;
            n=n/10;
        }
        if(c>0)
            System.out.println("The number of occurrences are: "+c);
        else
            System.out.println("No such value found!!!");



    }
}
