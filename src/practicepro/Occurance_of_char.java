package practicepro;

import java.util.HashSet;

public class Occurance_of_char {

	public static void main(String[] args) {
		String s="welcometotyss";
		
		HashSet<Character> set=new HashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		
		for(Character ch:set)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			if(count>1)               //only duplicate or repeated words
				                      //if you want unique or remove dup put if(count==1)
			System.out.print(ch);
			//System.out.print(count+" ");
		}
		

	}

}
