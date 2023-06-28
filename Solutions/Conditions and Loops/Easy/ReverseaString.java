package com.aritra;

import java.util.Locale;
import java.util.Scanner;

public class ReverseaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rev="";
        char ch;
        System.out.print("Enter the String::");
        String orig = sc.nextLine();
        int i;
        for(i=0;i<orig.length();i++){
            ch= orig.charAt(i);
            rev= ch + rev;
        }
         //Capitalising the first letter and lowering case of the last letter
        rev= rev.substring(0,1).toUpperCase()
                +rev.substring(1,rev.length()-1)
                +rev.substring(rev.length()-1,rev.length()).toLowerCase();
        System.out.println(rev);
    }
}
