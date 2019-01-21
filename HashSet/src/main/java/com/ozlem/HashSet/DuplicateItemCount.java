package com.ozlem.HashSet;
import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;

public class DuplicateItemCount {
	public static void main( String[] args )
    {
	
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("b");
		list.add("c");
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("yaşo");
		list.add("yaşo");
		list.add("yaşo");
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (String maplist : list) {
			Integer count = map.get(maplist);
			map.put(maplist, (count == null) ? 1 : count + 1);
		}
		printMap(map);
}
	  public static void printMap(HashMap<String, Integer> map){

			for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
				System.out.println("key : " + entry.getKey() + " count : "
					+ entry.getValue());
			}
				
		  }
}