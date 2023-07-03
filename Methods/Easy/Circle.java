package com.aritra;

import java.util.*;
public class Circle
{
	public static void main(String[] args) {
	    int r;
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the radius of the circle: ");
	    r= sc.nextInt();
	    circle(r);
	}
	public static void circle(int radius){
		    double area = 3.14 * radius * radius;
		    double circumference = 2 * 3.14 * radius;
		    System.out.println("The area of the circle is "+area);
		    System.out.println("The circumference of the circle is "+circumference);
	}
}
