package PRACTICENEW2023;

public class PALINDOME_NUMBERS {

	public static void main(String[] args) {

		int r,sum=0,temp;
		int n=608;
		temp=n;
		
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("pali");
		}
			else {
				System.out.println("not");
			}
			}
		
	}


