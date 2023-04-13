package PRACTICENEW2023;

public class Find_pair {

	public static void main(String[] args) {
		int a[]= {1,3,4,5,5,6,7,9,10};
		
	int n=15;
		findpair(a,n);
		
		

	}

	private static void findpair(int a[],int n) {
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if (a[i]+a[j]==n)
				{
					System.out.println("{"+a[i]+","+a[j]+ "}");
				}
			}
		}
		
	}

}
