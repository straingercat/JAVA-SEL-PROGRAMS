package practicepro;

public class Print_up_to_the_lenght {

	public static void main(String[] args) {
		String s="myself punith working in tyss";
		String str[]=s.split(" ");
		int count=0;
		
		for(int i=0;i<str.length;i++)
		{
			if(count<10)
			{
				System.out.print(str[i]+" ");
				count=count+str[i].length()+1;
			}
			else
			{
				break;
			}
		}

	}

}
