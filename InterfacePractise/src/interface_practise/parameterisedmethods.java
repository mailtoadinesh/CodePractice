package interface_practise;

import java.util.Scanner;

public class parameterisedmethods {
	
	private void sub()
	{
		int a,b;
		System.out.println("Enter 2 numbers:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Addition of two no's:"+(a+b));
	}
	
	public void sum()
	{
		int a,b;
		System.out.println("Enter 2 numbers:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Addition of two no's:"+(a+b));
	}
	public void sum(int x,int y)
	{
		System.out.println("Addition of two no's:"+(x+y));
	}

	public int sum1()
	{
		int a,b;
		System.out.println("Enter 2 numbers:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		return (a+b);
	}
		
		public int sum1(int x,int y)
		{
			return (x+y);
		}
		public static void mul()
		{
			int x=5,y=6;
			System.out.println(x*y);
		}
}