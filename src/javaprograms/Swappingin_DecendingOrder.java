	package javaprograms;

public class Swappingin_DecendingOrder {

	public static void main(String[] args) {
		int arr[]= {23,34,45,10,15};
		for(int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])  
				{
				int temp=arr[i]; //23 
				arr[i]=arr[j];   //34
				arr[j]=temp;   //23
				
				}
			}
		}
for(int i=0;i<arr.length;i++)
{
	System.out.println(arr[i]+"");
}
	}

}


	


