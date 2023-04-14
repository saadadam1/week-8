//Write a Java program to shuffle elements in a array list
import java.util.*;
class ArrayListColors{
  public static void main(String args[]){
    List<String> colors=new ArrayList<String>();
    colors.add("red");
    colors.add("blue");
    colors.add("green");
    colors.add("yellow");
//
    Collections.reverse(colors);
//
    System.out.println(colors);
   
      
  }
}