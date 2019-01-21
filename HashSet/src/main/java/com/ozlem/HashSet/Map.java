package com.ozlem.HashSet;
import java.util.HashMap;
import java.util.Set;
public class Map {
	 public class Entry {

	}

	public static void main( String[] args )
	    {
		 HashMap<String, String> list = new HashMap<String, String>();
		 
		 list.put("001", "DM");
		 list.put("010", "DM");
		 list.put("010", "DM");
		 list.put("010", "DM");
		 list.put("010", "DM");
		 System.out.println("For Loop:");
	        for (java.util.Map.Entry<String, String> me : list.entrySet()) {
	        	if(list.containsValue(me.getValue()))
	        	{
	        		  System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
	        	}
	        
	        }
		
	
}

}
