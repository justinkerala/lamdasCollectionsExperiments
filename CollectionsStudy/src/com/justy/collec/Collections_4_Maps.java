/**
 * @Project : CollectionsStudy
 * @Package : com.justy.collec
 * @fileName: Collections_4_Maps.java
 * @Date    : Nov 6, 2016
 * @author  : justin */
package com.justy.collec;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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
	
		
	
	}
}
