package javaprograms;

import java.util.LinkedHashSet;

public class Remove_Dup_word {

	public static void main(String[] args) {
		String s="welcome to tyss to company tyss company";
		
		//Spiting by space
		String str[]=s.split(" ");
		
		//Create set collection(hash set) and add all the character of the string in to set
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
		}
		
		//compare each char of the set with all character in the string
		for( String word:set)
			{
		System.out.print(word+" ");
		}
			
			
		
		
		
			
		}
		

	}

