package PRACTICENEW2023;

public class Remove_space {

	public static void main(String[] args) {
		String s="techno elevate being less complex";
		String s1="";
		
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ' && s.charAt(i)!='\t')
			{
				s1=s1+s.charAt(i);
			}
			
		}
		System.out.println(s1);
	}

}
