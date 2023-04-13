package PRACTICENEW2023;

import java.util.HashSet;

public class remove_dup_and_add {

	public static void main(String[] args) {
		
		String s="12345678";
		
		HashSet<Integer> set=new HashSet<Integer>();
		for(int i=0;i<s.length();i++)
		{
			String s1=""+s.charAt(i);
			int n = Integer.parseInt(s1);
			set.add(n);
			}
		int sum = 0;
		{
			for(int num:set)
			{
				sum=sum+num;
			}
			System.out.println(sum);
		}

	}

}
