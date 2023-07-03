package com.aritra;

import java.util.Scanner;

public class Election {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:: ");
        int age = sc.nextInt();
        if(vote(age))
            System.out.println("You are eligible to vote!!!");
        else
            System.out.println("You are not eligible to vote!!!");
    }
    public static boolean vote(int age)
    {
        return age >= 18;
    }
}
