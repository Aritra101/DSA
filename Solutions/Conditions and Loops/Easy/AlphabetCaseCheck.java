package com.aritra;

import java.util.Scanner;

public class AlphabetCaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);
        if (ch>='a' && ch<='b')
            System.out.println("LowerCase");
        else
            System.out.println("UpperCase");

    }
}
