package zzz;

public class String_palindrome {

	public static void main(String[] args) {
		String s="puni";
		String s1="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		
		if(s1.equals(s))
		{
			System.out.println("pali");
		}
		else
		{
			System.out.println("not a pali");
		}

	}

}
