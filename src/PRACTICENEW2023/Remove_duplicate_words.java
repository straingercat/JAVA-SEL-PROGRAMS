package PRACTICENEW2023;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Remove_duplicate_words {

	public static void main(String[] args) {
		
		String s= "go goa go gone ";
		String str[]=s.split(" ");
		
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
		}
		
		for(String removedup:set)
		{
			
				System.out.print(removedup+" ");
			}
		}

	}

