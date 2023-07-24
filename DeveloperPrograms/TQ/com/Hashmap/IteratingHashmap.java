package com.Hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IteratingHashmap {

	public static void main(String[] args) {
	HashMap<String,Float> smap=new HashMap();
	
	smap.put("sam", 89.f);
	smap.put(null, 0f);
	smap.put("Akshat", 90.5f);
	smap.put("Amey", 89.5f);
	
	
	System.out.println(smap);
	
	System.out.println("---------------");
	System.out.println("All keys");
	Set<String> keySet=smap.keySet();
	for(String s:keySet)
	{
		System.out.println(s);
	}
System.out.println("------------");	
System.out.println("All  values");

Collection<Float> marks=smap.values();
for(Float s:marks)
{
System.out.println(s);	
}

//key value pair

	for(Map.Entry<String, Float>en: smap.entrySet())
	{
		System.out.println(en.getKey()+"->"+en.getValue());
	}
		}

}
