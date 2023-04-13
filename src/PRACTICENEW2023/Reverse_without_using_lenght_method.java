package PRACTICENEW2023;

public class Reverse_without_using_lenght_method {

	public static void main(String[] args) {
		
		String s="punith";
		char c[]=s.toCharArray();
		int count=0;
		
		for(char a:c)
		{
			count++;
		}
			
		for(int i=count-1;i>=0;i--)
		{
			System.out.print(c[i]);
		}

	}

}
