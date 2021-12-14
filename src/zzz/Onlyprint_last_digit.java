package zzz;

public class Onlyprint_last_digit {

	public static void main(String[] args) {
		int a[]= {21,22,23,24,25,26,27,28};
		
		for(int i=0;i<a.length;i++)
			
		{
			int lstdigit=(a[i]%10);
		
		
		
		if(lstdigit==2)
		{
			System.out.println(a[i]);
		}

	}
	}
}

