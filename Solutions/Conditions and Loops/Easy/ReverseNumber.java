package com.aritra;

import java.util.Scanner;

public class ReverseNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int orig, rev=0,rem;
        System.out.print("Enter the number::");
        orig=sc.nextInt();
        while(orig>0){
            rem= orig%10;
            rev=rev*10+rem;
            orig=orig/10;


        }
        System.out.println("The reverse number is "+rev);

    }
}
