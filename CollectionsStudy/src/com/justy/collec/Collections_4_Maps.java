/**
 * @Project : CollectionsStudy
 * @Package : com.justy.collec
 * @fileName: Collections_4_Maps.java
 * @Date    : Nov 6, 2016
 * @author  : justin */
package com.justy.collec;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author justin 
 *
 */
public class Collections_4_Maps {

	
	public static void main(String[] args) {
		
		Map<String, String>map=new HashMap<>();
		map.put("key1", "Value1");
		map.put("key2", "Value2");
		map.put("key3", "Value3");
		map.put("key4", "Value4");
		map.put("key5", "Value5");
		map.put("key6", "Value6");
		map.put("key7", "Value7");
		map.put("key8", "Value8");
	
		
		Set<Map.Entry<String, String>>EntrySet=map.entrySet();
		
		for (Entry entry : EntrySet) {
			System.out.println(entry);
		}
	
		
		Set<Integer>treesetImpl=new TreeSet<Integer>();
		treesetImpl.add(21);
		treesetImpl.add(2);
		treesetImpl.add(1);
		treesetImpl.add(20);
		treesetImpl.add(10);
		treesetImpl.add(11);
		treesetImpl.forEach(System.out::println);
		
		//Using set for filtering and sorting a list. 
 		
		List<Integer>intList=new ArrayList<>();
		Set<Integer>listFilter=new TreeSet<Integer>();
		intList.add(233);
		intList.add(232);
		intList.add(232);
		System.out.println("===intList");
		intList.forEach(System.out::println);
		listFilter.addAll(intList);
		System.out.println("===SetList");
		listFilter.forEach(System.out::println);
		
		
		
		
	}
}
