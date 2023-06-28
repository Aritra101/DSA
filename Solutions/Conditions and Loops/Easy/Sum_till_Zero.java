package com.aritra;

import java.util.Scanner;

public class Sum_till_Zero {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc= new Scanner(System.in);
        while(true){
            System.out.print("Enter a number::");
            int n = sc.nextInt();
            if(n==0) {
                System.out.println("You Pressed Zero hence breaking the loop!!!!");
                break;
            }
            else if(n>0) {
                sum = sum + n;
                System.out.printf("The sum is %d \n", sum);
            }
            else
                System.out.println("Wrong Input!!!!!");
        }
    }
}
