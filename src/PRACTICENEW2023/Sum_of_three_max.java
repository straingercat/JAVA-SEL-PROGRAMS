package PRACTICENEW2023;

public class Sum_of_three_max {

	public static void main(String[] args) {
		
		int ar[]= {1,2,3,4,5,6,7,8,9,10};
		
		{
			for(int i=0;i<ar.length;i++ )
			{
				for(int j=0;j<ar.length;j++)
				{
					if(ar[i]>ar[j])
					{
						int temp=ar[i];
						ar[i]=ar[j];
						ar[j]=temp;
					}
					
				}
			}
				int sum=0;
				for(int i1=0;i1<3;i1++)
				{
					sum=sum+ar[i1];
					
				}
				System.out.println(sum);	
			}
		
		}
		
	}


