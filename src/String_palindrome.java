
public class String_palindrome {

	public static void main(String[] args) {
		String s="pup";
		String s1="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		
		if(s.equals(s1))
		{
			System.out.print("Given String is Palindrome");
		}
		else
		{
			System.out.print("Given String is not palindrome");
		}
	}

}
