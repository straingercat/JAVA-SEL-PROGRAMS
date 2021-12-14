package davinta;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Hash_map_to_arraylist {

	public static void main(String[] args) {
		HashMap map=new HashMap();
		map.put(1, "hi");
		map.put(2, "hello");
		map.put(3, "world");
		
		Collection m = map.values();
		
		ArrayList list =new ArrayList(m);
		System.out.println(list);

	}

}
