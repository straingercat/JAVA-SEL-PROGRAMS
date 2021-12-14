package javaprograms;

public class Find_the_pair_whose_sum_is_15 {

	public static void main(String[] args) {
		int a[]= {12,3,14,1,16,-1,6,5,7};
		int n=15;
		findThepair(a,n);
	}

	private static void findThepair(int[] a, int n) {
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==n)
				{
					System.out.println("{"+ a[i]+  ","  +a[j]  +"}");
				}
			}
		}
		
	}

}
