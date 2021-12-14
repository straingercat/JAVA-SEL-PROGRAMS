package javaprograms;

public class Reverse_String_Using3rdVariable {

	public static void main(String[] args) 
	/*{
		String s="india";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
			rev=rev+s.charAt(i);
		 
		System.out.print(rev);
		}*/
	{
	String s="madam";
	String rev="";
	for(int i=s.length()-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
	}
	System.out.println(rev);
	if(s.equals(rev))
	{
		System.out.println("Given string is a Palindrome");
	}
	else
	{
		System.out.println("not a palindrome");
	}
	}
}
