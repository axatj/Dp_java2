package com.hashmaplab;
import java.util.*;
public class MapWithCharacter {

	public static void main(String[] args) {
    HashMap<Character,String> hs=new HashMap<>();
    hs.put('c', "choti");
    hs.put('d', "Deepak");
    hs.put('a', "Akshat");
    hs.put('m', "mitali");
    
    Set<Character>set=hs.keySet();
    System.out.println("show all keys");
    for(Character ch:set)
    {
    	System.out.println(ch);
    }
System.out.println("show all values");
Collection<String> val=hs.values();
for(String st:val)
{
System.out.println(st);	
}
for(Map.Entry<Character, String>en: hs.entrySet())
{
System.out.println(en.getKey()+" "+en.getValue());	
}

}

}
