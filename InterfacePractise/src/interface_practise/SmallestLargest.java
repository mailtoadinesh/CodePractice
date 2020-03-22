package interface_practise;

import java.util.Scanner;

public class SmallestLargest {

	public static void main(String[] args) {
		int i,j;
		System.out.println("Enter a Numbers");
		Scanner sc1=new Scanner(System.in);
		j=sc1.nextInt();
		int a[]=new int[j];
		for(i=0;i<a.length;i++)
		{
			Scanner sc=new Scanner(System.in);
			a[i]=sc.nextInt();
		}
		for(i=0;i<a.length;i++)
		{
			System.out.println("Value of integer array "+a[i]);
		}
		int largest = a[0];
		int smallest = a[0];
		
		for (i=1;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				largest =a[i];
			}
			else if (a[i]<smallest)
			{
				smallest = a[i];
			}
		}
		
		System.out.println("Largest Number :" +largest);
		System.out.println("Smallest Number :" +smallest);
		

	}

}
