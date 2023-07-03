package com.aritra;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int ans = sum();
        System.out.println("The sum is: "+ans);
    }
    public static int sum(){
        Scanner sc = new Scanner(System.in);
        int i,j,sum=0;
        System.out.print("Enter the first number::");
        i= sc.nextInt();
        System.out.print("Enter the second number::");
        j= sc.nextInt();
        sum=i+j;
        return sum;

    }
}
