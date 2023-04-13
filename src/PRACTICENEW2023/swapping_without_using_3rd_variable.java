package PRACTICENEW2023;

public class swapping_without_using_3rd_variable {

	public static void main(String[] args) {
		String a="being ";
		String b="complex";
		
		
		System.out.println("---String before swapp---");
		
		a=a+b;
		
		System.out.println(a);
		
		b=a.substring(0, a.length()-b.length());
		
		a=a.substring(b.length());
		System.out.println("---String before swapp---");
		System.out.println(a);
		System.out.println(b);
		
	}

}
