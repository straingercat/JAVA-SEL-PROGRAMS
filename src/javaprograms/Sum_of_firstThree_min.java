package javaprograms;

public class Sum_of_firstThree_min {

	public static void main(String[] args) {
		int arr[]= {20,40,60,80,100   };
		for(int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])  
				{
					int temp=arr[i];  
				arr[i]=arr[j];
				arr[j]=temp;
				
				}
			}
		}
		int sum=0;
		for(int i=0;i<3;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("sum of first max no"  +sum);
	}

}