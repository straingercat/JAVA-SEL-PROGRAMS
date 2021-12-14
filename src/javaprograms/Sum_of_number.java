package javaprograms;

import java.util.Scanner;

public class Sum_of_number {

	public static void main(String[] args) {
	int n,sum=0;
	System.out.println("enter the term");
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(int i=1;i<=n;i++)
{
	sum=sum+i;
}
System.out.println("sum of number:-"+sum);
	
	}

}
