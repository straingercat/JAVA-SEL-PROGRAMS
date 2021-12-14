package practicepro;

public class Reverse_int {

	public static void main(String[] args) {
		int n=123456;
		int r;
		int rev=0;
		
		while(n!=0)
		{
			r=n%10;
	rev=rev*10+r;
			n=n/10;
			
		}
System.out.println(rev);
	}

}
