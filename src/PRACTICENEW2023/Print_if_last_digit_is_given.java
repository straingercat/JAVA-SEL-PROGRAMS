package PRACTICENEW2023;

public class Print_if_last_digit_is_given {

	public static void main(String[] args) {
		
		int a[]= {10,15,20,25,30,35};
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%5==0)   //remainder
			{
				System.out.println(a[i]);
			}
		}

	}

}
