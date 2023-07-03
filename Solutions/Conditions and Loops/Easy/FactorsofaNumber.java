package com.aritra;

import java.util.Scanner;

public class FactorsofaNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n,i;
        System.out.print("Enter the number::");
        n=sc.nextInt();
        System.out.printf("The factorials of %d are:",n);
        for(i=1;i<=n;i++){
            if(n%i==0)
                System.out.printf("%d ",i);
        }

    }
}
