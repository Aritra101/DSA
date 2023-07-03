package com.aritra;

public class PrimeNo_IN_Range {
    public static void main(String[] args) {
    int a = 10,b=20;
    prime(a,b);

    }
    public static void prime(int n1,int n2)
    {
        int i;
        for(i=n1;i<=n2;i++)
        {
            int count = 0;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    count ++;
                }

            }
            if(count==0)
                System.out.print(i + " ");
        }
    }
}
