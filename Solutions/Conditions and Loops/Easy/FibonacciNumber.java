package com.aritra;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0, b=1, n,i,temp;
        System.out.println("Enter nth Term::");
        n= sc.nextInt();
        System.out.printf("%d %d",a,b);
        for (i= 2 ; i<=n; i++ )//Loop starts from 2 as 0 and 1 already printed
            {
            temp = a+b;
            System.out.printf(" %d",temp);
            a=b;
            b=temp;
        }
        System.out.printf("\n The nth fibonacci Number is %d", b);
    }
}
