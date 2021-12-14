package practicepro;

public class ExcludefewNumbers {

	public static void main(String[] args) {
		int a[]= {5,10,15,20,25,30,35,40,45,50};
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%10==5)
			{
				System.out.println(a[i]);
			}
		
		}
	}

}
