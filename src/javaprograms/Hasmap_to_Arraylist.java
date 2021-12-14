package javaprograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;



public class Hasmap_to_Arraylist {

	public static void main(String[] args) {
	HashMap map=new HashMap();
	map.put(1, "apple");
	map.put(2, "mango");
	map.put(3, "organge");

	Collection col = map.values();
	ArrayList list=new ArrayList(col);
	System.out.println(list);
	
	

	}

}
