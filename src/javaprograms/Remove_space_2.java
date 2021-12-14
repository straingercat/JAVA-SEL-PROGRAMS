package javaprograms;

public class Remove_space_2 {

	public static void main(String[] args) {
		String s="Welcome to testyantra";
		String s1="";
		
		for(int i=0;i<s.length();i++)
		{
			if (s.charAt(i)!=' ' && s.charAt(i)!='\t')
{
	s1=s1+s.charAt(i);
}

		}
System.out.println(s1);
	}

}
		