package practicepro;

public class Swaping1 {

	public static void main(String[] args) {
		String s="my office testyanra";
		String str[]=s.split(" ");
		
		String temp=str[0];
		str[0]=str[str.length-2];
		str[str.length-2]=temp;
		for(int i=0;i<str.length;i++)
		{
			System.out.print(str[i]+" ");
		}
		
		
		
	}

}
