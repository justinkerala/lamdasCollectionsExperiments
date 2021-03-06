/**
 * @Project : CollectionsStudy
 * @Package : com.justy.model
 * @fileName: Person.java
 * @Date    : Oct 30, 2016
 * @author  : justin */
package com.justy.model;

/**
 * @author justin 
 *
 */
public class Person {

	private String name;
	private String age;
	private String gender;
	/**
	 * @param string
	 * @param string2
	 * @param string3
	 */
	public Person(String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
		
		this.name=string;
		this.age=string2;
		this.gender=string3;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	} 
}
