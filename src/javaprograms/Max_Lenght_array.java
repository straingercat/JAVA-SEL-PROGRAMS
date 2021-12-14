package javaprograms;

public class Max_Lenght_array {

	public static void main(String[] args) {
		String arr[]= {"hi","bye","p","mangoo","tyss"};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].length()<arr[j].length())  
				{
					String temp=arr[i];  
				arr[i]=arr[j];
				arr[j]=temp;
				
				}
			}
		}
		System.out.println(arr[arr.length-5]);
				
		}
		

	}


