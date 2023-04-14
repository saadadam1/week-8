import java.util.*;
class ArrayListInteger{
  public static void main(String args[]){
    List<Integer> ls=new ArrayList<Integer>();
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<5;i++){
      ls.add(sc.nextInt());
    }
     for(Integer num:ls){
       if(num%2==0){
         System.out.println(num);
       }
     }    
    //System.out.println(ls);  
}
}