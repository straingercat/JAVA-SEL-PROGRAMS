package PRACTICENEW2023;

interface ams{
	void display();
}
class B implements ams{
	public void display() {
		System.out.println("implements & public must and should");
	}

}

public class Interface {

	public static void main(String[] args) {
		
		B obj=new B();
		obj.display();

	}

}
