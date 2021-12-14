package collections;

import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		//null as key
		//null as value
		//try to add heterogeneous value
		TreeMap mp=new TreeMap();
		//mp.put(null, 10);
		mp.put(2, null);
		//mp.put(3, 100);
		//mp.put(4, "mp");
		System.out.println(mp);
	}

}
