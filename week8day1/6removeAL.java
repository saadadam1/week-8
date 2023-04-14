//Write a Java program to remove the third element from a array list

import java.util.*;
class ArrayListRetrieve{
  public static void main(String args[]){
    List<String> colors=new ArrayList<String>();
    colors.add("red");
    colors.add("blue");
    colors.add("green");
    colors.add("yellow");
    System.out.println(colors);
    System.out.println("After removing 3rd element");
    colors.remove(3);
    System.out.println(colors);
  }
}