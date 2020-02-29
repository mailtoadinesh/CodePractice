package sample_pgm;

import java.util.Scanner;

public class GetInputArray {
	int i[] = new int[5];
	char c[]=new char [3];
	String s[]= new String[5];
	
	public void getintarray() {
		System.out.println("*****Input Array**************");
		Scanner sc=new Scanner(System.in);
		for(int j=0;j<i.length;j++)
		{
			i[j]=sc.nextInt();
		}
		
		System.out.println("Print Input Array output");
		for(int j=0;j<i.length;j++)
		{
			System.out.println(i[j]);
		}
	}
	
	public void getchararray() {
		System.out.println("*****Char Array**************");
		Scanner sc=new Scanner(System.in);
		for(int j=0;j<c.length;j++)
		{
			c[j]=sc.next().charAt(0);
			
		}
		
		System.out.println("Print Char Array output");
		for(int j=0;j<c.length;j++)
		{
			System.out.println(c[j]);
		}
	}
	public void getstringarray() {
		System.out.println("*****string Array**************");
		Scanner sc=new Scanner(System.in);
		for(int j=0;j<s.length;j++)
		{
			s[j]=sc.nextLine();
			
		}
		
		System.out.println("Print string Array output");
		for(int j=0;j<s.length;j++)
		{
			System.out.println(s[j]);
		}
	}
		
		

	public static void main(String[] args) {
		GetInputArray obj = new GetInputArray();
		obj.getintarray();
		obj.getchararray();
		obj.getstringarray();
		}

}
