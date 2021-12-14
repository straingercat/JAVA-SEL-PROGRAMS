package javaprograms;

import java.util.HashSet;

public class Find_the_no_occurance_char_in_given_string {

	public static void main(String[] args) {
		String s="nammamysuru";
		
		//Create set collection(hash set) and add all the character of the string in to set
		
		HashSet<Character> set=new HashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		
		
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
		System.out.print(ch);
		System.out.print(count);
			
		}
		

	}

}
