package PRACTICENEW2023;

import java.util.Scanner;

public class Fib_user_input {

	public static void main(String[] args) {
		
		
		System.out.println("Enter the n value");
		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		
		System.out.println("Enter the inital value");
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		
		int b=1;
		int c;
		
	for(int i=1;i<=n;i++)
	{
		
		System.out.println(a);
	
	c=a+b;
	a=b;
	b=c;
		
		
	}	
		
	}
}
