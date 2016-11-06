/**
 * @Project : CollectionsStudy
 * @Package : com.justy.model
 * @fileName: Student.java
 * @Date    : Nov 4, 2016
 * @author  : justin */
package com.justy.model;

/**
 * @author justin 
 *
 */



public  class Student implements Comparable { 
    private int id;
    private String name;
    private int age;
  
    
    
    
    
    /**
	 * @param id
	 * @param name
	 * @param age
	 */
	public Student(int id, String name, int age) {
		//super();
		this.id = id;
		this.name = name;
		this.age = age;
	}




	/*
     *Compare a given Student with current(this) object.
     *If current Student id is greater than the received object,
     *then current object is greater than the other.
     */   
	 
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}




	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	public int getAge() {
		return age;
	}




	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}




	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
		if(o.getClass()!=this.getClass())
		{
			return 0;
		}
		
		Student s=(Student)o;
		  return (this.id < s.id ) ? -1: (this.id> s.id) ? 1:0 ;

	}




	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}

 