/**
 * @Project : CollectionsStudy
 * @Package : com.justy.collec
 * @fileName: Collections_5.java
 * @Date    : Nov 7, 2016
 * @author  : justin */
package com.justy.collec;

/**
 * @author Justin Mathew Maniyamprayil
 *
 */

import java.util.Observable;
import java.util.Observer;

class MyObservable extends Observable {
  public void drinkPotion() {
    name = "java2s ";
    setChanged();
    notifyObservers();
  }
  public String getName() {
    return name;
  }
  private String name = "java2s";
}
class Person implements Observer {
  public Person(String name, String says) {
    this.name = name;
    this.says = says;
  }
  public void update(Observable thing, Object o) {
    System.out.println("It's " + ((MyObservable) thing).getName() + "\n" + name + ": " + says);
  }
  private String name;
  private String says;
}
public class MainClass {
  public static void main(String[] args) {
    MyObservable man = new MyObservable();
    Observer[] crowd = { 
        new Person("A", "a"),
        new Person("B", "b"),
        new Person("C", "c"),
        new Person("D", "d"),
        new Person("E", "e") 
                     };
    for (Observer observer : crowd) {
      man.addObserver(observer);
    }
    man.drinkPotion();
  }
}