package javaprograms;


import java.util.LinkedHashSet;

public class Print_only_unique_char {

	public static void main(String[] args) {
	String s="mandya";
		
		//Create set collection(hash set) and add all the character of the string in to set
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		
		//input
		System.out.println(set);
		
		
		//compare each char of the set with all character in the string
		for( Character ch:set)
			{
		int count=0;
		for(int i=0;i<s.length();i++)
			
			
			//if it is matching increase the count
		{
			if (ch==s.charAt(i))
			{
				count++;
				
			}
		}
		
		
		//print the both character and the count
		if(count==1) {
			System.out.print(ch+"");
		}
		
		
			
		}
		

	}

}
