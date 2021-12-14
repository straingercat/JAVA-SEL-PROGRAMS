package javaprograms;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
	int n,sum=0,r,temp;
	System.out.println("enter the number");
	Scanner s1=new Scanner(System.in);
	n=s1.nextInt();
	temp=n;
	while(n>0)
	{
		r=n%10; //-----remainder value
		sum=(sum*10)+r;
		n=n/10; //-----dividend value        
		}
	if(temp==sum)
	{
		System.out.println("Palindrome");
	}
	else
	{
		System.out.println("Not a palindrome");
	}
	}
}
	

	


