package javaprograms; 

public class MaxLenghtinarry2 {

	public static void main(String[] args) {
		String arr[]= {"hi","bye","p","mango","tyss","happy"};
		String max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			
			if(max.length()<arr[i].length())  
				{
				max=arr[i];
				
				}
			}
			for(int i=0;i<arr.length;i++)
			{
				if (max.length()==arr[i].length())
				{
			
		System.out.println(arr[i]);
				
		}
			}
		}
		

}
