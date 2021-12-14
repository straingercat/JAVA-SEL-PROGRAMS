package zzz;

public class Print_up_to_ {

	public static void main(String[] args) {
		
		String s="my name is punith from tyss";
		String str[]=s.split(" ");
		int count=0;
		for(int i=0;i<str.length;i++)
		{
			{
				if(count<20)
			
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
}
