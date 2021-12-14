package javaprograms;

import java.util.Scanner;

public class Fibnocci_series {

	public static void main(String[] args) {
		int term,a=0,b=1,c;
		System.out.println("enter the term");
		Scanner s=new Scanner(System.in);
		term=s.nextInt();
		for(int i=1;i<=term;i++)
		{
		System.out.println(a+"");
		c=a+b;
		a=b;
		b=c;
		}
}
}
