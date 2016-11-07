/**
 * @Project : CollectionsStudy
 * @Package : com.justy.designpatterns.observer
 * @fileName: OctalObserver.java
 * @Date    : Nov 7, 2016
 * @author  :   */
package com.justy.designpatterns.observer;

/**
 * @author   
 *
 */
public class OctalObserver extends Observer{

	   public OctalObserver(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }

	   @Override
	   public void update() {
	     System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) ); 
	   }
	}