package zzz;

public class Excluding_some_numbers_or_remove_unwanted_numbers {

	public static void main(String[] args) {
		
		int a[]= {11,12,13,14,15,16,17,18,19,20};
		
		for(int i=0;i<a.length;i++)
			
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}

	}

}
