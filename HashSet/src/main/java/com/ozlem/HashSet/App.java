package com.ozlem.HashSet;
import java.util.HashMap;
import java.util.Set;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	HashMap<String, String> hm = new HashMap<String, String>();
        hm.put("20", "Banana");
        hm.put("40", "Apple");
        hm.put("20", "Banana");
        printMap(hm);
    }

    public static void printMap(HashMap<String, String> map){
        
        Set<String> keys = map.keySet();
        for(String p:keys){
            System.out.println(p+"==>"+map.get(p));
        }
    }
}
