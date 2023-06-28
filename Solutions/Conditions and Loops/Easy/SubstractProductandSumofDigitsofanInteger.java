package com.aritra;

import java.util.Scanner;

public class SubstractProductandSumofDigitsofanInteger {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int sum=0,product=1,num,rem,sub;
        System.out.print("Enter the number::");
        num=sc.nextInt();
        while(num>0){
            rem= num%10;
            sum=sum+rem;
            product=product*rem;
            num=num/10;
        }
        sub= product-sum;
        System.out.println("The Sum of the digits is::"+sum);
        System.out.println("The Product of the digits is::"+product);
        System.out.println("The difference between product of the digits and sum of the digits is::"+sub);




    }
}
