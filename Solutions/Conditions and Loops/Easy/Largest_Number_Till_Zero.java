package com.aritra;

import java.util.Scanner;

public class Largest_Number_Till_Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max=0;
        while (true) {
            System.out.print("Enter a number::");
            int n = sc.nextInt();
            if(n==0){
                System.out.println("You Pressed Zero hence exiting the operation!!!");
                break;
                }
            else if(n>0) {
                if (n > max)
                    max = n;
            }
            else {
                    System.out.println("Wrong Input!!!!!!");
                    break;
                }


        }
        System.out.println("The largest number is::"+max);
    }
}
