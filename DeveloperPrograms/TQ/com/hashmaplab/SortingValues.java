package com.hashmaplab;
import java.util.*;

public class SortingValues {

	public static void main(String[] args) {
   HashMap<Integer,String> hs=new HashMap<>();
   ArrayList<String> al=new ArrayList<>();
   hs.put(1, "pune");
   hs.put(2, "nagpur");
   hs.put(3, "sangli");
   hs.put(4, "satara");
   
   //1st step to get values
   Collection<String> col=hs.values();
   Iterator<String> it=col.iterator();
   while(it.hasNext())
   {
	   al.add(it.next());
   }
   Collections.sort(al);
   System.out.println(al);
   
 //2nd way   
   
	}

}
