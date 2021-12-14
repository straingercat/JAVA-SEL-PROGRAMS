package davinta;

public class Prime {

	public static void main(String[] args) {
	int term=7,count=0;
	for(int i=1;i<=term;i++)
	{
		
		if(term%i==0)
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
			System.out.println("not");
		}
	}
	}


