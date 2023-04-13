package PRACTICENEW2023;

public class First_max {

	public static void main(String[] args) {
		int a[]= {1,2,3,46,8,6,9};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if (a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				
			}
		}
	}
		
System.out.println(a[6]);
}
}
