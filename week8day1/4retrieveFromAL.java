//Write a Java program to retrieve an element (at a specified index) from a given array list.
  import java.util.*;
class ArrayListRetrieve{
  public static void main(String args[]){
    List<String> colors=new ArrayList<String>();
    colors.add("red");
    colors.add("blue");
    colors.add("green");
    colors.set(0,"black");
    System.out.println(colors.get(0));
      
  }
}
