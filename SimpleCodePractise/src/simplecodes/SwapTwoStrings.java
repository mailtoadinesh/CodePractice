package simplecodes;

import java.util.Scanner;

public class SwapTwoStrings {

	public static void main(String[] args) {
		String i,j;
		System.out.println("Enter Two String Values");
		Scanner sc=new Scanner(System.in);
		i=sc.nextLine();
		j=sc.nextLine();
		System.out.println("Value of X before Swap: "+i);
		System.out.println("Value of Y before Swap: "+j);
		i=i+j;
		System.out.println(i.length());
		System.out.println(j.length());
		j=i.substring(0,i.length()- j.length());
		i=i.substring(j.length());
		System.out.println("Value of X After Swap: "+i);
		System.out.println("Value of Y After Swap: "+j);
	}

}
