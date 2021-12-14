package javaprograms;

public class ExcludingFewNumbers 
{
public static void main(String[] args) 
{
	int a[]= {10,11,12,13,14,15,16,17,18,19,20};
	for(int i=0; i<a.length;i++)
	{
		if(a[i]%5!=0)
		{
			System.out.println(a[i]);
		}
	}
}
}
