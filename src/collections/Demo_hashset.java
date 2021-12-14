package collections;

import java.util.HashSet;

public class Demo_hashset {

	public static void main(String[] args) {
		HashSet set=new HashSet();
		set.add(10);
		set.add(20);
		set.add(40);
		set.add("mango");
		set.add('p');
		set.add("null");
		set.add("null");
		System.out.println(set);
		//null add only ones order of insertion not allowed, dup not allowed
		
		
		
		

	}

}
