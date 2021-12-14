package practicepro;

public class Seggrigate {

	public static void main(String[] args) {
		String s="abc@123";
		String a="";
		String sp="";
		String n="";
		
		for(int i=0;i<s.length();i++)
		if(s.charAt(i)>='a' && s.charAt(i)<='z')
		{
			a=a+s.charAt(i);
		}
		else if(s.charAt(i)>=48 && s.charAt(i)<=56)
		{
			n=n+s.charAt(i);
		}
		else
		{
			sp=sp+s.charAt(i);
		}
		System.out.println(a);
		System.out.println(n);
		System.out.println(sp);
	}

}
