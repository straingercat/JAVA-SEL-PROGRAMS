package javaprograms;

public class minaarrylength2 {

	public static void main(String[] args) {
		String arr[]= {"hi","bye","p","mango","tyss","happy"};
		String min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			
			if(min.length()>arr[i].length())  
				{
				min=arr[i];
				
				}
			}
			for(int i=0;i<arr.length;i++)
			{
				if (min.length()==arr[i].length())
				{
			
		System.out.println(arr[i]);
				
		}
			}
		}
		

}

