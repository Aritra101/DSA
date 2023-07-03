
import java.util.*;
public class Prime
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
// 		System.out.println("Hello World");
        System.out.print("Enter a number::");
        int n = sc.nextInt();
        prime(n);
	}
	public static void prime(int prime){
	    int i=0,count=0;
	    for (i=2;i<prime;i++){
	        if(prime%i==0)
	            count++;
	        
	    }
	    if(count==0){
	        System.out.printf("%d is a prime number",prime);
	    }
	    else
	        System.out.printf("%d is not a prime number",prime);
	}
}
