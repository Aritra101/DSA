
import java.util.*;
public class Duck_Number
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
// 		System.out.println("Hello World");
        System.out.print("Enter a number::");
        int n = sc.nextInt();
        duck(n);
	}
	public static void duck(int n){
        int rem, temp,count = 0 ;
        temp = n;
        while(temp>9){
            rem = temp%10;
            if (rem == 0)
                count++;
            temp = temp/10;    
        }
        if (count > 0)
            System.out.printf("%d is a duck number and it contains %d Zeroes in it",n,count);
        else
            System.out.printf("%d is not a duck number",n);
}
}
