package oops_concepts;


public class A {
void add()
{
	int a=10,b=20,c;
	c=a+b;
	System.out.println(c);
}


	void add(int x,int y)
	{
		int c;
		c=x+y;
		System.out.println(c);
	}
	public static void main(String[]args) {
		A r=new A();
		r.add(1,1);
		
		
	}
} 