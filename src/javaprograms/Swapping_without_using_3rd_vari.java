package javaprograms;

public class Swapping_without_using_3rd_vari {

	public static void main(String[] args) {
		String a="hello";
		String b="hi";
		System.out.println("before swapp----");
		System.out.print(a+" ");
		System.out.println(b);
		
		
		//append a and b:
		
	a=a+b; //hellohi
	
	//store initial string a in string b;
	
	b=a.substring(0,a.length()-b.length());  //hello stored in b
	
	a=a.substring(b.length()); //hi is stored in a
	  
	System.out.println("after swapp*****");
	System.out.print(a+" ");
	System.out.print(b);
	
		
		

	}

}
