import java.util.HashMap;
import java.util.Map;

class MapDemo {
  public static void main(String[] args) {
    HashMap<Integer, String> map = new HashMap<Integer, String>();
    map.put(1, "saad");
    map.put(2, "Adam");
    map.putIfAbsent(3, "Bandady");
    //map.remove(2);
    System.out.println(map);
    Integer key=3;
    /*for(Map.Entry m : map.entrySet()) {
      System.out.println(m.getKey() + " " + m.getValue());
    }*/
    for(Map.Entry m : map.entrySet()) {
      if(m.getKey()==key){
        System.out.println(m.getValue());
      }
      }
  }
}