package dropppdowwn;

public class Interview_Program_amdocs_Reverse_integer {

	public static void main(String[] args) {
		String s="7894";
		String rev="";
		
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
System.out.print(rev);
	}

}
