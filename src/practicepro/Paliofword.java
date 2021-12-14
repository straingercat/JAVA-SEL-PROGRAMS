package practicepro;

public class Paliofword {

	public static void main(String[] args) {
		String s="pap";
		String s1="";
		
		
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}	
		System.out.println(s1);
		if(s.equals(s1))
		{
			System.out.println("palin");
		}
		else
		{
			System.out.println("not a pali");
		}
		
	}

}

