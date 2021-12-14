package oops_concepts;



class Encap {
	private int value;
	
	public void setvalue(int x)
	{
		value=x;
	}
	
	public int getvalue()
	{
		return value;
		
	}

}



	public class Main1 {
		public static void main(String[] args) {
			Encap e=new Encap();
			e.setvalue(100);
			System.out.println(e.getvalue());
			
			
		}
	}


	