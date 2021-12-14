package oops_concepts;


class shape
{
	void draw()
	{
		System.out.println("class1");
	}
}

class square extends  shape{
	@Override
	void draw()
	{
		super.draw();
		System.out.println("class2");
	}
}
public class Methodoverriding {

	public static void main(String[] args) {
		shape r=new square();
		r.draw();

	}

}
