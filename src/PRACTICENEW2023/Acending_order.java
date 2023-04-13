package PRACTICENEW2023;

public class Acending_order {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,4,7,9};
		
		for (int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if (a[i]< a[j])
				{
				int temp=a[i];
				a[i]=a[j];
				a[i]=temp;
				
				}
				
			}
		}
				for(int i=0;i<a.length;i++)
				{
					System.out.println(a[i]);
				}
						
					
						
			}
		}
		
	
	


