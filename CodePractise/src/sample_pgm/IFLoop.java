package sample_pgm;

import java.util.Scanner;

public class IFLoop {
	int a,b,c;
	String s1,s2;
	
	public void greatestnum() {
		System.out.println("Greatest of 3 no's");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 No's");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a>b&&a>c)
			System.out.println("A is greater");
		else if(b>c)
			System.out.println("B is greater");
		else
			System.out.println("C is greater");
		
	}

	public void Divisiblebynum() {
		System.out.println("Divisible by given no or not");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 No's");
		a=sc.nextInt();
		b=sc.nextInt();
		if(a%b==0)
			System.out.println("Number is divisible");
		else 
			System.out.println("Number is not divisible");
	}
	public void stringcompare() {
		System.out.println("String length comparison");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two strings");
		s1=sc.nextLine();
		s2=sc.nextLine();
		if(s1.length()>s2.length())
			System.out.println("s1 is greater");
		else if(s1.length()==s2.length())
			System.out.println("Both are equal");
		else 
			System.out.println("s2 is greater");
			
	}
	
	public static void main(String[] args) {
	
		IFLoop obj=new IFLoop();
		obj.greatestnum();
		obj.Divisiblebynum();
		obj.stringcompare();

	}

}
