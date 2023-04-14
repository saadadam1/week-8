//Write a Java program to iterate through all elements in a array list

import java.util.*;
class ArrayListColors{
  public static void main(String args[]){
    List<String> colors=new ArrayList<String>();
    colors.add("red");
    colors.add("blue");
    colors.add("green");
    System.out.println(colors);
    for( Object obj:colors){
      System.out.println(obj);
    }     
  }
}