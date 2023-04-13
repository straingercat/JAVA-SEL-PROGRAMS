package PRACTICENEW2023;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Remove_dup_char {

	public static void main(String[] args) {
		
		String a="strings";
		
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<a.length();i++)
		{
			set.add(a.charAt(i));
		}
		
		for(Character c:set)
		{
			System.out.print(c);
		}
	}

}
