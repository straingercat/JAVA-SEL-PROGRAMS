package PRACTICENEW2023;

abstract class A{
	abstract void display();
}

class abn extends A{
	void display()
	{
		System.out.println("definition of class A");
	}
}
	

public class abstractmain {

	public static void main(String[] args) {
	   abn a=new abn();
	   a.display();
	   
		

	}

}
