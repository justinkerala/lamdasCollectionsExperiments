/**
 * @Project : CollectionsStudy
 * @Package : com.justy.collec
 * @fileName: Collections_3_Comparable.java
 * @Date    : Nov 4, 2016
 * @author  : justin */
package com.justy.collec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.justy.model.Student;

/**
 * @author justin 
 *
 */
public class Collections_3_Comparable {

	
@SuppressWarnings("unchecked")
public static void main(String[] args) {
	List<Student>stud=new ArrayList<Student>();
	Student st1=new Student(2,"Perry",23);
	Student st2=new Student(4,"Tom",21);
	Student st3=new Student(1,"Terry",20);
	Student st4=new Student(3,"Merry",28);

	Student st5=new Student(7,"sdsd",11);

     stud.add(st1);
     stud.add(st2);
     stud.add(st3);
     stud.add(st4);

     String abc="asd add asd sdasd";
     
     stud.forEach(System.out::println); 
     
     Comparator<Student> comp=new Comparator<Student>() {
		
		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			  return (o1.getAge() < o2.getAge() ) ? -1: (o1.getAge()> o2.getAge()) ? 1:0 ;
		}
	};
	
 //   Collections.sort(stud);
/*String a="Justin";
String b="A";
System.out.println("Comparing"+a.compareTo(b));

*/

	Comparator<Student>compareName=new Comparator<Student>() {
		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
		return	o1.getName().compareTo(o2.getName());
		}
	};
	
	Collections.sort(stud,compareName);

	System.out.println("Odered By name;..");
	stud.forEach(System.out::println);
	
	System.out.println("Searching For Tom");
	
	System.out.println(Collections.binarySearch(stud, new Student(0, "Tom", 12), compareName));
	
	
	
	//	Collections.sort(stud, comp);
//    System.out.println("sorted");
//    stud.forEach(System.out::println); 

     System.out.println("Binary search.."+Collections.binarySearch(stud,st2,comp));     
     
     System.out.println("\n");
     
    // Collections.sort(stud);

      
     
     List<String>words=new ArrayList<String>();
     words.add("AVC");
     words.add("AAA");
     
   
      
     System.out.println("==>"+Collections.binarySearch(words,"AVC"));
    // System.out.println(words);
     
     
     
}	

	
}
