/**
 * @Project : CollectionsStudy
 * @Package : com.justy.collec
 * @fileName: Collections_1.java
 * @Date    : Oct 30, 2016
 * @author  : justin */
package com.justy.collec;

import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author justin 
 *
 */
public class Collections_1 {
	
	public static void main(String[] args) {

		
		Function<String, String>converter=e->e+"APpp";
		
		 
  
		List list=new LinkedList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		//Iterator it=list.iterator();
//		while (it.hasNext()) {
//
//			String value=(String)it.next();
//			System.out.println(value);
//			if(value.equals("one"))
//			{
//				it.remove();
//			}
//			
// 		}
		
		 
		list.forEach(System.out::println);
		
	//take one and append string and collect it as list.
		
		System.out.println(list.stream()
		.filter(e->e.equals("one"))
		.map(converter)
		.collect(Collectors.toList()));
	 
		 Map<String, String>hashMap=new HashMap<String,String>();
		 
		 hashMap.put("key1", "Justin");
		 hashMap.put("key24", "Jerry");
		 hashMap.put("key1", "justin");
		 hashMap.put("key44", "Jerry");//will not allow duplicates
	//	 System.out.println(hashMap);
		 
		 
		//take element jerry  and collect it back to new map
		 
		Map<String,String>newmap= (Map<String, String>) hashMap.entrySet()
	        .stream()
	        .filter(e->e.getValue().equals("Jerry"))
	        .collect(Collectors.toMap(Entry::getKey,Entry::getValue));
	        	        
	        
		
		//Summary statics. 
		List<Integer>ages=Arrays.asList(1,2,34,5,66,7,67);
		
		  IntSummaryStatistics summStati=ages.stream()
				  .mapToInt(x->x)
				  .summaryStatistics();
		  
		System.out.println(summStati.getMin());
		
		    
 
 	}

}
