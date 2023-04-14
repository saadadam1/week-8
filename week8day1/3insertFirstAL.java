//Write a Java program to insert an element into the array list at the first position
  import java.util.*;
class ArrayListInsert{
  public static void main(String args[]){
    List<String> colors=new ArrayList<String>();
    colors.add("red");
    colors.add("blue");
    colors.add("green");
    colors.set(0,"black");
    System.out.println(colors);
      
  }
}