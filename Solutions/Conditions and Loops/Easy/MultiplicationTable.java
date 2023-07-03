////Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.
package com.aritra;
import java.util.*;
public class MultiplicationTable {

    public static void main(String[] args) {

        int i = 1;
        Scanner sc = new Scanner(System.in)
        int num = sc.nextInt();
        while(i <= 10)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
            i++;
        }
    }
}
