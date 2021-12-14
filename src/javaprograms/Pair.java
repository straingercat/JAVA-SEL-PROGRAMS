package javaprograms;

public class Pair {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,6,2};
		int n=5;
		findthepair(a,n);

	}

	private static void findthepair(int[] a, int n) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==n)
				{
					System.out.println(a[i]+ ","+a[j]);
				}
			}
		}
	}

}
