package zzz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Hashmap_to_arraylist {

	public static void main(String[] args) {
		
		HashMap map=new HashMap();
		map.put(1, "apple");
		map.put(2, "mango");
		map.put(3,"orange");
		
		
		Collection val = map.values();
		
		ArrayList list=new  ArrayList(val);
		System.out.println(list);
		

	}

}
