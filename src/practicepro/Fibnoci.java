package practicepro;

public class Fibnoci {

	public static void main(String[] args) {
		int n=5,a=0,b=1,c;
		
		for(int i=1;i<=n;i++)
		{
			System.out.println(a+" ");
			c=a+b;
			a=b;
			b=c;
		}

	}

}
