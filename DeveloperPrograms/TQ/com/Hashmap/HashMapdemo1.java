package com.Hashmap;
import java.util.*;
import java.util.Map.Entry;
public class HashMapdemo1 {

	public static void main(String[] args) {
     	ArrayList<String>al=new ArrayList<String>();
    al.add("a");
	al.add("b");
	al.add("c");
	al.add("d");
	al.add("a");
	al.add("b");
	al.add("a");
	al.add("c");
	
	System.out.println(al);
	HashMap<String,Integer>hs=new HashMap<String,Integer>();
	Iterator<String>itr=al.iterator();
	while(itr.hasNext())
	{
	String s=itr.next();
	int c=0;
	if(!hs.containsKey(s))
	{
	hs.put(s,1);
}else
{
hs.put(s,hs.get(s)+1);
}
}
	Set<Entry<String,Integer>>set=hs.entrySet();
	Iterator<Entry<String,Integer>>itr1=set.iterator();
	while(itr1.hasNext())
	{
		Entry<String,Integer>entry=itr1.next();
		System.out.println(entry.getKey()+" "+entry.getValue());
	}
	 
}}