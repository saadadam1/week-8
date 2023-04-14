 import java.util.*;
class ArrayListAddAll{
  public static void main(String args[]){
    List<Float> list=new ArrayList<Float>();
     Scanner sc=new Scanner(System.in);
     list.add(23.445f);
     list.add(12.34f);
     list.add(45.67f);
     list.add(78.90f);
     System.out.println(list);
     System.out.println(list.get(2));
     list.set(1,23.45f);
     list.remove(2);
     System.out.println(list.indexOf(45.67f));
      System.out.println(list);
    // ArrayList2
       List<Float> list1=new ArrayList<Float>();
     list1.addAll(list);
     System.out.println(list1);
}
}