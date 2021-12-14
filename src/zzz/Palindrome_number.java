package zzz;

public class Palindrome_number {

	public static void main(String[] args) {
		int n=12221;
		int temp;
		int sum=0,r;
		 
		temp=n;
		while(n!=0)
		{
			r=n%10;
			sum=sum*10+r;
			n=n/10;
			
		}
		
		if(sum==temp)
		{
			System.out.println("pali");
		}
		else
		{
			System.out.println("not a pali");
		}
	}

}
