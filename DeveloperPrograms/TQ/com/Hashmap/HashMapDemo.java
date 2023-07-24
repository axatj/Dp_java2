package com.Hashmap;
import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String>map=new HashMap();
        
		map.put(1, "Akshat");
		map.put(2, "Abhishek");
		map.put(3, "amey");
		map.put(null, "Na");
		map.put(3, "atul");
		
		
		map.put(null, "Unknown");
		map.put(5, null);
		map.put(6, null);
		map.put(7, null);
		System.out.println(map);
		System.out.println("Value :"+map.get(7));
		
		System.out.println("Cheks key :"+map.containsKey(6));
		
		System.out.println("Checks value:"+map.containsValue("Abhishek"));
		System.out.println(map.putIfAbsent(3, "kim"));
		System.out.println(map);
		
		
		
	}

}
