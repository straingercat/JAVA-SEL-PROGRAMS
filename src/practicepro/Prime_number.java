package practicepro;

public class Prime_number {

	public static void main(String[] args) {
		int n=16;
		int count=0;
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
				if(count==2)
				{
					System.out.println("prime");
				}
				else
				{
					System.out.println("not a prime");
				}
		}
		

	}


