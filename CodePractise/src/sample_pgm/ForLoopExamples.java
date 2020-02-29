package sample_pgm;

import java.util.Scanner;

public class ForLoopExamples {
	int i,j,k;
	
	public void Horizontal() {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		j=sc.nextInt();
		for(i=1;i<=j;i++) {
			System.out.println();
			for(k=1;k<=j;k++) {
				System.out.print(k);
			}
		}
		
	}

	public void Verticall() {
		System.out.println();
		System.out.println("************************************");
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		j=sc.nextInt();
		for(i=1;i<=j;i++) {
			System.out.println();
			for(k=1;k<=j;k++) {
				System.out.print(i);
			}
		}
	}
	public void HorizontalI() {
		System.out.println();
		System.out.println("************************************");
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		j=sc.nextInt();
		for(i=1;i<=j;i++) {
			System.out.println();
			for(k=1;k<=i;k++) {
				System.out.print(k);
			}
		}
	}
		public void VerticallI() {
			System.out.println();
			System.out.println("************************************");
			System.out.println("Enter a number");
			Scanner sc=new Scanner(System.in);
			j=sc.nextInt();
			for(i=1;i<=j;i++) {
				System.out.println();
				for(k=1;k<=i;k++) {
					System.out.print(i);
				}
			}
		}
	public static void main(String[] args) {
		ForLoopExamples obj=new ForLoopExamples();
		obj.Horizontal();
		obj.Verticall();
		obj.HorizontalI();
		obj.VerticallI();

	}

}
