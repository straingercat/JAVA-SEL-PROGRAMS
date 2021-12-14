package javaprograms;

import java.util.HashSet;

public class Occurance_of_word_in_String {

	public static void main(String[] args) {
	String s="welcome to tyss to company";
		
	//Splitting by space
	String str[]=s.split(" ");
	
	
		//Create set collection(hash set) and add all the character of the string in to set
	
	    HashSet<String> set=new HashSet<String>();
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
		}
		
		
		//compare each char of the set with all character in the string
		for( String word:set)
			{
		int count=0;
		for(int i=0;i<str.length;i++)
			
			
			//if it is matching increase the count
		{
			if (word.equals(str[i]))
			{
				count++;
				
			}
		}
		
		
		//print the both character and the count
		System.out.print(word+":");
		System.out.println(count);
			
		}
		

	}

}