package PRACTICENEW2023;

 

public class method_overloading {
	
	void display() 
	{
		System.out.println("method");
	}
	
	void display1(int a)
	{
		System.out.println(a);
	}
	

	public static void main(String[] args) {
		method_overloading n=new method_overloading();
		method_overloading n1=new method_overloading();
		 n.display();
		 n1.display1(20);

	}

	
}
