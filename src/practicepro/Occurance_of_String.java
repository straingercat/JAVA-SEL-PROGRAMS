package practicepro;

import java.util.HashSet;

public class Occurance_of_String {

	public static void main(String[] args) {
		String s="world hevy weight chamion world wwe wwe";
		String str[]=s.split(" ");
		 
		HashSet<String> set=new HashSet<String>();
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
		}
		
		for(String word:set)
		{
			int count=0;
			for(int i=0;i<str.length;i++)
			{
				if(word.equals(str[i]))
				{
					count++;
				}
			}
		
			System.out.println(word);
			System.out.println(count);
			
		}
		
		
		
	}

}
