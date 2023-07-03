package com.aritra;

import java.util.Scanner;

public class CountPrime {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number:: ");
    int n = sc.nextInt();
    int ans = countPrimes(n);
    System.out.println(ans);
    }
    public static int countPrimes(int n) {
        int i,j,countprime=0;
        for(i=2;i<n;i++)
        {
            int count=0;
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==0)
                countprime++;
        }
        return countprime;
    }


}
