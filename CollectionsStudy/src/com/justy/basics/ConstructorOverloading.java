/**
 * @Project : CollectionsStudy
 * @Package : com.justy.basics
 * @fileName: ConstructorOverloading.java
 * @Date    : Oct 30, 2016
 * @author  : justin */
package com.justy.basics;

/**
 * @author justin 
 *
 */
public class ConstructorOverloading {


public static void main(String[] args) {
	abc obj1=new abc();
	
System.out.println(obj1);

abc obj2=new abc("testing",212);

System.out.println(obj2);

}	

	
}


class abc{
	
	/**
	 * 
	 */
	/**
	 * 
	 */
	public abc() {
		// TODO Auto-generated constructor stub
	}
	public abc(String a,Integer b) {
		// TODO Auto-generated constructor stub
		this.a=a;
		this.b=b;
	}
	
	/**
	 * 
	 */
	public abc(String a) {

	this.a=a;
	
	}
	
	private String a;
	private Integer b;
	/**
	 * @return the a
	 */
	public String getA() {
		return a;
	}
	/**
	 * @param a the a to set
	 */
	public void setA(String a) {
		this.a = a;
	}
	/**
	 * @return the b
	 */
	public Integer getB() {
		return b;
	}
	/**
	 * @param b the b to set
	 */
	public void setB(Integer b) {
		this.b = b;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	
	@Override
	public String toString() {
		return "abc [a=" + a + ", b=" + b + "]";
	}
	
	
	 
	
}
