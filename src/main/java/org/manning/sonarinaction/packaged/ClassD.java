package org.manning.sonarinaction.packaged;

import org.manning.sonarinaction.packagea.ClassA;

public class ClassD 
{
  private ClassA classA = new ClassA();
  public void doSomethingBasedOneClassA(){
    System.out.println (classA.toString());
  }

  public String toString(){
    return "classD";
  }
}
