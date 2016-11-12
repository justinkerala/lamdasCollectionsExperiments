/**
 * @Project : CollectionsStudy
 * @Package : com.justy.collec
 * @fileName: Collections_5.java
 * @Date    : Nov 12, 2016
 * @author  : justin */
package com.justy.collec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author justin 
 *
 */
public class Collections_5 {
	
public static void main(String[] args) {
	
	List<String>charList=new ArrayList<String>();
	
	
	charList.add("a");
	charList.add("b");
	charList.add("b");
	charList.add("c");
	charList.add("s");
	charList.add("b");
	charList.add("s");
	
	System.out.println("Number of occurances=="+Collections.frequency(charList, "b"));
	
	
	
	Set<String>hashSet=new HashSet<String>(charList);
	
//	hashSet.addAll(charList);
	
	hashSet.forEach(System.out::println);
	
}
}
