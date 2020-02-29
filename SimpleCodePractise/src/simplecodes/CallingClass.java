package simplecodes;

import java.util.Scanner;

public class CallingClass {

	public static void main(String[] args) {
		parameterisedmethods obj=new parameterisedmethods();
		System.out.println("No input and no return values");
		obj.sum();
		System.out.println("Some input and no return values");
		obj.sum(50,190);
		System.out.println("No input and return values");
		int z= obj.sum1();
		System.out.println(z);
		System.out.println("Some input and return values");
		int d=obj.sum1(60,77);
		System.out.println(d);
		parameterisedmethods.mul();
		
	}
	private void sub()
	{
		int a,b;
		System.out.println("Enter 2 numbers:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Addition of two no's:"+(a+b));
	}
}
