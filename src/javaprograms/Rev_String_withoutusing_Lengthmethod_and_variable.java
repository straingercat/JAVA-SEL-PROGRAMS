package javaprograms;

public class Rev_String_withoutusing_Lengthmethod_and_variable {

	public static void main(String[] args) {
		String s="india";
		char c[]=s.toCharArray();
		int count=0;
		for (char a:c)
		{
			count++;		
		}
		System.out.println(count);
		for(int i=count-1;i>=0;i--)
		{
			System.out.print(c[i]);
		}

	}

}
