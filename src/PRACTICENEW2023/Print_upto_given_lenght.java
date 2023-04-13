package PRACTICENEW2023;

public class Print_upto_given_lenght {

	public static void main(String[] args) {
		
		String s="testyantra software soultion";
		
		String str[]=s.split(" ");
		int count=0;
		
		for(int i=0;i<s.strip().length();i++)
		{
			
			if (count<16)
			{
				System.out.print(str[i]+" ");
				count=count+str[i].length()+1;
			}
			else
			{
				break;
			}
		}
		
		

	}

}
