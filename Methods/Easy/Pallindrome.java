
import java.util.*;
public class Pallindrome
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
// 		System.out.println("Hello World");
        System.out.print("Enter a number::");
        int n = sc.nextInt();
        pallindrome(n);
	}
	public static void pallindrome(int n){
	    int rev=0,temp=n,rem=0;
        while(temp>0){
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp/10;
        }
        if (rev==n)
            System.out.printf("%d is a pallindrome number",n);
        else
            System.out.printf("%d is not a pallindrome number",n);
	}
}
