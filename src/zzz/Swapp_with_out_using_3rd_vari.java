package zzz;

public class Swapp_with_out_using_3rd_vari {

	public static void main(String[] args) {
		String a="punith";
		String b="raj";
		
		a=a+b;
		
		b=a.substring(0, a.length()-b.length());
		
		a=a.substring(b.length());
		
		System.out.print(a);
		System.out.print(b);

	}

}
