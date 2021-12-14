package practicepro;

public class Removespace_2 {

	public static void main(String[] args) {
		String s="my sdet profile";
		String str[]=s.split(" ");
		
		for(int i=0;i<str.length;i++)
		{
			if(s.charAt(i)!=' ' && s.charAt(i)!='\t');
			{
				System.out.print(str[i]);	
			}
			
		}

	}

}
