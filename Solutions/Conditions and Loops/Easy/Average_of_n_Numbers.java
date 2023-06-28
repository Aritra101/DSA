package com.aritra;
import java.util.*;
public class Average_of_n_Numbers {
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        int n,count = 0,i;
        float avg = 0, sum = 0,num;
        System.out.print("Enter how many numbers you want to input:: ");
        n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            System.out.printf("Enter Number%d:: ",i);
            num = sc.nextInt();
            sum = sum + num;
            count++;
        }
        avg= sum/count;
        System.out.println("Average of these Numbers are::"+avg);
    }
}
