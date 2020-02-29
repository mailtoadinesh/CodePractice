package sample_pgm;

import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Basics");
		int a;
		int b;
		a= 10;b=20;
		double c;
		c=a+b;
		System.out.println(c);
		c=c*b;
	
		
		double m = 109.20;
		m = m+c;
		System.out.println(c+"\n"+m);
		
		String g="9";
		int h=Integer.parseInt(g);
		System.out.println(h);
		
		String s1 = "Hello";
		String s2="World";
		System.out.println(a+b+s1);
		a++;
		System.out.println(a+b+s2);
		++a;
		System.out.println(s1+a+b);
		System.out.println(s2+a+b+s1);
		System.out.println("Value of S1 & S2\t"+s1+"\t"+s2);
		
		System.out.println("*************************************");
		Arithmetic_Operators obj = new Arithmetic_Operators();
		obj.sum();
		obj.sub();
		Arithmetic_Operators.mul();
		Arithmetic_Operators.Div();
		division();
		MainProgram obj2 = new MainProgram();
		obj2.multiplication();
				
		
	}

	public static void division()
	{
		int a,b;
		double d;
		System.out.println("Code inside mail class");
		System.out.println("Division Operation");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two number");
		a=sc.nextInt();
		b=sc.nextInt();
		d=a/b;
		System.out.println("Division of two numbers:" +d);
	}
	public void multiplication()
	{
		System.out.println("Code inside mail class");
		System.out.println("Multiplication Operation");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int d=a*b;
		System.out.println("Multiplication of two numbers:" +d);
		
	}
	
}

