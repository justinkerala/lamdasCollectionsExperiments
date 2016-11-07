/**
 * @Project : CollectionsStudy
 * @Package : com.justy.designpatterns.observer
 * @fileName: BinaryObserver.java
 * @Date    : Nov 7, 2016
 * @author  :   */
package com.justy.designpatterns.observer;

/**
 * @author   
 *
 */
public class BinaryObserver extends Observer{

	   public BinaryObserver(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }

	   @Override
	   public void update() {
	      System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) ); 
	   }
	}