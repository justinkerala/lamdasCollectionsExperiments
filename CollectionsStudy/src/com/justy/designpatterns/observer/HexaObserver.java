/**
 * @Project : CollectionsStudy
 * @Package : com.justy.designpatterns.observer
 * @fileName: HexaObserver.java
 * @Date    : Nov 7, 2016
 * @author  :   */
package com.justy.designpatterns.observer;

/**
 * @author   
 *
 */
public class HexaObserver extends Observer{

	   public HexaObserver(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }

	   @Override
	   public void update() {
	      System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() ); 
	   }
	}
