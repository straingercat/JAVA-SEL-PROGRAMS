package zzz;

public class MAximum_number {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8};
		
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
System.out.print(a[7]);
	}

}
