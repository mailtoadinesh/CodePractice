package interface_practise;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int n,j=0;
		System.out.println("Enter a Number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int s=n;
		while(n>0)
		{
			int m=n%10;
			j=j*10+m;
			n=n/10;
						
		}
		if(j==s)
		{
			System.out.println("Given no is Palindrome number");
		}
		else
			System.out.println("Number is not Palindrome number");

	}

}
