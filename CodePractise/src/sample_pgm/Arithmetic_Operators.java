package sample_pgm;

import java.util.Scanner;

public class Arithmetic_Operators {
	int a,b;
	double d;
	
	public void sum()
	{
		System.out.println("Addition Operation");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two number");
		a=sc.nextInt();
		b=sc.nextInt();
		d=a+b;
		System.out.println("Sum of two numbers:" +d);
		
	}
	
	public void sub()
	{
		System.out.println("Subtraction Operation");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two number");
		a=sc.nextInt();
		b=sc.nextInt();
		d=a-b;
		System.out.println("Subtraction of two numbers:" +d);
		
	}
	
	public static void mul()
	{
		System.out.println("Multiplication Operation");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int d=a*b;
		System.out.println("Multiplication of two numbers:" +d);
		
	}

	public static void Div()
	{
		System.out.println("Division Operation");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		double d=a/b;
		System.out.println("Division of two numbers:" +d);
		
	}
}
