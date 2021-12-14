package practicepro;

public class Palindrome {

	public static void main(String[] args) {
		int n=120;
		int sum=0,rem,temp;
		
		temp=n;
		while (n!=0)
		{
			rem=n%10;
			sum=sum*10+rem;
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
