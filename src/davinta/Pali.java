package davinta;

public class Pali {

	public static void main(String[] args) {
		int n=401,s=0,r,temp;
		temp=n;
		 while(n>0)
		 {
			 r=n%10;
			 s=(s*10)+r;
			 n=n/10;	 
		 }
		 if (temp==s)
		 {
			 System.out.println("pali");
		 }
		 else
		 {
			 System.out.println("not");
		 }

	}

}
