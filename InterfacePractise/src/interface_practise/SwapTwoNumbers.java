package interface_practise;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int i,j;
		System.out.println("Enter Two Numbers");
		Scanner sc=new Scanner(System.in);
		i=sc.nextInt();
		j=sc.nextInt();
		System.out.println("Value of X before Swap: "+i);
		System.out.println("Value of Y before Swap: "+j);
		i=i+j;
		j=i-j;
		i=i-j;
		System.out.println("Value of X After Swap: "+i);
		System.out.println("Value of Y After Swap: "+j);

	}

}
