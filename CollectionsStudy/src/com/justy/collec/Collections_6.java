package com.justy.collec;

import java.util.Set;
import java.util.TreeSet;

import com.justy.basics.Person;
public class Collections_6 {

	
	public static void main(String[] args) {
		
		//Treeset Implementations. by overriding equals methode. for correct behaviour in the treeset
		
		
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
 		
 		Set<Person>personsList=new TreeSet<Person>();
 		
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
 		
 		System.out.println(personsList);

 		
 		
	}
}
