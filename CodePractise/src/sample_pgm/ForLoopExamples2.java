package sample_pgm;

import java.util.Scanner;

public class ForLoopExamples2 {
	int i,j,k,l,m;
	
	public void inversion() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter a number:");
		i=sc.nextInt();
		l=i-1;
		for (j=1;j<=i;j++) 
		{
			for(k=1;k<=l;k++) 
			{
				System.out.print(" ");
			}
			l--;
			
			for(m=1;m<=j;m++)
			{
				System.out.print(m);
			}
			System.out.println("");
		}
		
		System.out.println("******************************");
		
	}
	public void Diamond() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter a number:");
		i=sc.nextInt();
		l=i-1;
		for (j=1;j<=i;j++) 
		{
			for(k=1;k<=l;k++) 
			{
				System.out.print(" ");
			}
			l--;
			
			for(m=1;m<=2*j-1;m++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("******************************");
		
	}
	

	public static void main(String[] args) {
		ForLoopExamples2 obj = new ForLoopExamples2();
		obj.inversion();
		obj.Diamond();
		int i,j,n=5;
		int space = 1;
        for (j = 1; j <= n - 1; j++) 
        {
            for (i = 1; i <= space; i++) 
            {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i <= 2 * (n - j) - 1; i++) 
            {
                System.out.print(i);
            }
            System.out.println("");
        }
	}
}
