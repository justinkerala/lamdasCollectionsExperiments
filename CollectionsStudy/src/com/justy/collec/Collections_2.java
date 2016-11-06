/**
 * @Project : CollectionsStudy
 * @Package : com.justy.collec
 * @fileName: Collections_2.java
 * @Date    : Oct 31, 2016
 * @author  : justin */
package com.justy.collec;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;

import com.justy.model.Person;

/**
 * @author justin 
 *
 */
public class Collections_2 {

	
	public static void main(String[] args) {
		
		/*Person p=new Person();
		
		Person p1=p;
		System.out.println(p.equals(p1));//true both pointing to same location
		
		p1=new Person();
		System.out.println(p.equals(p1));//false both pointing to diff location
*/
         
		Person p2=new Person("Jerry", "21", "Male");
		Person p3=new Person("TerryP33", "21", "Female");
		Person p4=new Person("Kerry", "24", "Male");
		Person p5=new Person("Lerry", "21", "Female");
		Person p6=new Person("Jerry", "21", "Male");
		
		
		List<Person>pList=new ArrayList<Person>();
		
		pList.add(p2);
		pList.add(p3);
		pList.add(p4);
		pList.add(p5);
		pList.forEach(System.out::println);
		System.out.println("\n");
		pList.remove(p3);
		System.out.println("\n");
		pList.forEach(System.out::println);
		
		
 		
		
		Map<Person, Person>personMap=new HashMap<Person, Person>();
		personMap.put(p2, p2);
		personMap.put(p3, p3);
		personMap.put(p4, p4);
		personMap.put(p2, p5);
		
	 Iterator<Map.Entry<Person, Person>>entries=personMap.entrySet().iterator();
	 
	 
	/* while(entries.hasNext()){

		 Entry<Person, Person>entry=entries.next();

		 
		 System.out.println(entry.getKey().equals(p2));
		 
// Person [name=Jerry, age=21, gender=Male]=Person [name=Lerry, age=21, gender=Female]
// Person [name=Terry, age=21, gender=Female]=Person [name=Terry, age=21, gender=Female]
// Person [name=Kerry, age=21, gender=Male]=Person [name=Kerry, age=21, gender=Male]

	 }
		*/
	
	
		
	}
}
