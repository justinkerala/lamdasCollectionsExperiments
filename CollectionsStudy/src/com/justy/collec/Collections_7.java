package com.justy.collec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.justy.basics.Person;

/**
 * @author Justin Mathew
 * 
 * Collections.unmodifiableList example.
 *
 */
public class Collections_7 {
	static List<Person>personsList;
	
	public static List<Person> getPersonsList() {
	
		
		return Collections.unmodifiableList(personsList);
		
//		return personsList;
	}

	public static void setPersonsList(List<Person> personsList) {
		Collections_7.personsList = personsList;
	}

	public static void main(String[] args) {

 		Person p1=  new Person(2, "Rahil");
 		Person p2=  new Person(1, "Zach");
 		Person p3=  new Person(3, "Lilluby");
 		Person p4=  new Person(7, "CheGuve");
 		Person p5=  new Person(5, "Kaiser");
 		Person p6=  new Person(6, "Huiser");
 		Person p7=  new Person(4, "Justin");
 		Person p8=  new Person(9, "Cherok");
 		Person p9=  new Person(8, "Abin");
 		Person p99= new Person(8, "Abin");//repetation
 		
 		personsList=new ArrayList<>();
 		personsList.add(p1);
 		personsList.add(p2);
 		personsList.add(p3);
 		personsList.add(p4);
 		personsList.add(p5);
 		personsList.add(p6);
 		personsList.add(p7);
 		personsList.add(p8);
 		personsList.add(p9);
 		personsList.add(p99);
 		
 		
 		Collections_7 c7=new Collections_7();
 		
 		c7.setPersonsList(personsList);
 		
 		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {

				c7.getPersonsList().add(new Person(1, "asdasd"));
			}
		});
 		t1.start();
 		
		
    }
	
	
}
