package PRACTICENEW2023;

public class PALINDROME_WORD {

	public static void main(String[] args) {
		String s="meo";
		String s1="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		
		if(s.equals(s1))
		{
			System.out.println("pali");
		}
		else
			{
				System.out.println("not");
			}
		}
	}


