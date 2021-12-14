package javaprogramsnew1;



public class Demo {
	public static void main(String[] args) {
		
		String s="my name is sohan working in tyss";
		
		//i want to print all the words with a condition like length=4
		
		String[] str = s.split(" ");
		
		int count=0; //0 3 8 11 17
		for (int i = 0; i < str.length; i++)  //0<7 1<7 2<7 3<7 4<7
		{
			
			if(count<16) //0<14 3<14 8<14  11<14  17<14
			{
				
				System.out.print(str[i]+" ");   //my name is sohan
				count=count+str[i].length()+1;  //0+3, 3+5 ,8+3, 11+6
			}
			else
			{
				break;
			}
		}
		
		
	}
}
