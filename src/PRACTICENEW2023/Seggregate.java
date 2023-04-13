package PRACTICENEW2023;

public class Seggregate {

	public static void main(String[] args) {
		String p="puni@6192$";
		String alpha="";
		String numb="";
		String specl="";
		
		for(int i=0;i<p.length();i++)
		{
			if(p.charAt(i)>='a' && p.charAt(i)<='z')
			{
				alpha=alpha+p.charAt(i);
				
			}
			else if(p.charAt(i)>=48 && p.charAt(i)<=57)
			{
				numb=numb+p.charAt(i);
			}
			else
			{
				specl=specl+p.charAt(i);
				
			}
			
		}
		System.out.println(alpha);
		System.out.println(numb);
		System.out.println(specl);
	}

	
		
	}


