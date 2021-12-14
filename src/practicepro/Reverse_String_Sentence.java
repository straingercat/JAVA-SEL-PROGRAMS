package practicepro;

public class Reverse_String_Sentence {

	public static void main(String[] args) {
		String s="my name is sohan";
		String str[]=s.split(" ");
		String rev=" ";
		
		for(int i=str.length-1;i>=0;i--)
		{
			rev=rev+str[i]+" ";
		}
System.out.print(rev);
	}

}
