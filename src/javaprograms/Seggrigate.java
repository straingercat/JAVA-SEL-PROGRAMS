package javaprograms;



public class Seggrigate {

	public static void main(String[] args) {
		String s="ab4@5xy$6";
		String Alpha=""; 
		String Numeric="";  
		String Splchr="";
		
		for (int i = 0; i < s.length(); i++) 
			
		{
		
			if (s.charAt(i)>='a' && s.charAt(i)<='z') 
			{
			
			Alpha=Alpha+s.charAt(i);
			}
		
		else if(s.charAt(i)>=48 && s.charAt(i)<=56)
		{
			Numeric=Numeric+s.charAt(i);
		}
		else
		{
			Splchr=Splchr+s.charAt(i);
		}
		
		System.out.println(Alpha);
		System.out.println(Splchr);
		System.out.println(Numeric );
		}	

	}
}

