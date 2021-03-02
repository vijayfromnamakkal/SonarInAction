package org.manning.sonarinaction.packagea;

import org.manning.sonarinaction.packagec.ClassC;

public class ClassA 
{
  private ClassC classB = new ClassC();
  public void doSomething(){
    System.out.println ( "doSomething");
  }
  public void doSomethingBasedOnClassB(){
    System.out.println (classB.toString());
  }
}
