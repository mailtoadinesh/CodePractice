package java_code;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n,i,k,j=0;
		System.out.println("Enter a Number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=n;
		while(n>0)
		{
			i=n%10;
			j=j+i*i*i;
			n=n/10;
		}
		System.out.println(j);
		if(j==k) {
			System.out.println("Given number is Armstrong");
		}
		else
		{
			System.out.println("Given number is not Armstrong");
		}
	}

}
