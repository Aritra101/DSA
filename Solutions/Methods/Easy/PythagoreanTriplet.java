
import java.util.*;
public class PythagoreanTriplet
{
	public static void main(String[] args) {
	    int num1,num2,num3;
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter num1: ");
	    num1= sc.nextInt();
	    System.out.print("Enter num2: ");
	    num2= sc.nextInt();
	    System.out.print("Enter num3: ");
	    num3= sc.nextInt();
	    PythagoreanTriplet(num1,num2,num3);
	}
	public static void PythagoreanTriplet(int a, int b,int c){
        int temp1 = c*c;
        int temp2 = (a*a) + (b*b);
        if(temp1 == temp2)
            System.out.printf("%d, %d and %d form a PythagoreanTriplet",a,b,c);
        else
            System.out.printf("%d, %d and %d does not form a PythagoreanTriplet",a,b,c);
	}
}
