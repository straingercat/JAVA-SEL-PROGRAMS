package javaprograms;

import java.util.HashSet;

public class Remove_Dup_add {

	public static void main(String[] args) {
		String s="12345123";
		
		HashSet<Integer> set=new HashSet<Integer>();
		for(int i=0;i<s.length();i++)
		{
			String s1=""+s.charAt(i);
			int n=Integer.parseInt(s1);
			set.add(n);
		}
		int sum=0;
		for(Integer i:set)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}

}
