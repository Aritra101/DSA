package com.aritra;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c, max=0;
        System.out.print("Enter three numbers::");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        // Approach 1
//        if (a>b)
//            max=a;
//        else
//            max=b;
//        if(c>max)
//            max=c;
//        System.out.printf("The maximum among %d, %d, %d is %d ",a,b,c,max);

        //Approach 2
//        max = a;
//        if(b>max)
//            max = b;
//        if(c>max)
//            max = c;
//        System.out.printf("The maximum among %d, %d, %d is %d ",a,b,c,max);

        //Approach3
        max = Math.max(c,(Math.max(a,b)));
        System.out.printf("The maximum among %d, %d, %d is %d ",a,b,c,max);


    }
}
