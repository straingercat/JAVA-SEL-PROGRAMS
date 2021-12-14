package practicepro;

public class Swapping_without_using_3rd_variable {

	public static void main(String[] args) {
		String a="hi";
		String b="hello";
		
		a=a+b;
		
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		System.out.println(a);
		System.out.println(b);
	}

}
