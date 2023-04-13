package PRACTICENEW2023;

public class PALINDROME_ARRAY {

	public static void main(String[] args) {
		
		int a[]= {121,134,123,515};
		
		for(int i=0;i<a.length;i++)
		{
			int n=a[i];
			int sum=0;
			int r;
			while(n!=0) 
			{
				r=n%10;
				sum=sum*10+r;
				n=n/10;
			}
				if(sum==a[i])
				{
					System.out.println(a[i]);
				}
					
				}
			}
		}
	

	


