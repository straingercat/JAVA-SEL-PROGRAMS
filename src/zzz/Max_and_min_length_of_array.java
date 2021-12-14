package zzz;

public class Max_and_min_length_of_array {

	public static void main(String[] args) {
		String a[]= {"my","office","testyantra"};
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if (a[i].length()>a[j].length())
				{
					String temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
				
		}
System.out.println(a[2]);
	}

}
