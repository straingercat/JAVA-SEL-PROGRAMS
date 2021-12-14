package practicepro;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Hashmap_to_arraylist {

	public static void main(String[] args) {
		HashMap map=new HashMap();
		map.put(01, "apple");
		map.put(02, "mango");
		
		Collection vl = map.values();
		
		ArrayList list=new ArrayList(vl);
		System.out.println(list);

	}

}
