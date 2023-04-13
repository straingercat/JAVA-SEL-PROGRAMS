package PRACTICENEW2023;

public class reverse_string_using_3rd_variable {

	public static void main(String[] args) {
		
		String s="raj";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
			System.out.print(rev);	

	}

}
