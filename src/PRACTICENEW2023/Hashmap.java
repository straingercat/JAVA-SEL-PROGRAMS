package PRACTICENEW2023;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {

HashMap map=new HashMap();
map.put(1, "one");
map.put(2, "two");
map.put(3, "three");
map.put(4, "four");

Collection ele = map.values();

ArrayList list=new ArrayList(ele);


	System.out.println(list);




	}

}
