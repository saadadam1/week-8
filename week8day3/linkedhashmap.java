import java.util.*;
class MapDemo{
  public static void main(String args[]){
    LinkedHashMap<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
    map.put(12,1234);
    map.put(15,3456);
    map.put(16,4567);
    System.out.println(map);
    //for(Map.Entry m:map.entrySet()){
      if(map.containsValue(4578)){
        System.out.println("Found");
      }
    else{
      System.out.println("Not Found");
    }
    
  }
}

