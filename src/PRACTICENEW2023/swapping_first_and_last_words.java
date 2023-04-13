package PRACTICENEW2023;

public class swapping_first_and_last_words {

	public static void main(String[] args) {

		String s="being less complex";
		String str[]=s.split(" ");
		
		String temp=str[0];
		str[0]=str[str.length-1];
		str[str.length-1]=temp;
		
		for(int i=0;i<str.length;i++)
		{
			System.out.print(str[i]+" ");
		}
		
		
		


	}

}
