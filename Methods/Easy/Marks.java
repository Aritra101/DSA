
import java.util.*;
public class Marks
{
	public static void main(String[] args) {
	    int marks;
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter marks: ");
	    marks= sc.nextInt();
	    result(marks);
	}
	public static void result(int marks){
        if(marks>90)
            System.out.println("AA");
        else if(marks>80 && marks<=90)
            System.out.println("AB");
        else if(marks>70 && marks<=80)
            System.out.println("BB");
        else if(marks>60 && marks<=70)
            System.out.println("BC");
        else if(marks>50 && marks<=60)
            System.out.println("CD");
        else if(marks>40 && marks<=50)
            System.out.println("DD");
        else if(marks<=40)
            System.out.println("Fail");
	}
}
