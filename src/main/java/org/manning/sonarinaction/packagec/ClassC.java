package org.manning.sonarinaction.packagec;

import org.manning.sonarinaction.packaged.ClassD;

public class ClassC 
{
  private ClassD classD = new ClassD();
  public void doSomethingBasedOneClassD(){
    System.out.println (classD.toString());
  }

  public String toString(){
    return "classC";
  }
}
