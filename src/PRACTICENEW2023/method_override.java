package PRACTICENEW2023;

class parent{
	void display()
	{
		System.out.println("parent");
	}
}

class child{
	void display() 
	{
		System.out.println("child");
	}
}

public class method_override {

	public static void main(String[] args) {
		parent c=new parent();
		c.display();
		

	}

}
