import java.util.HashMap;

import java.util.Map.*;
 class HashMap1{
  public static void main(String[] agrs){
    HashMap<String,Integer> map=new HashMap<>();
    map.put("srinidhi",1);
    map.put("nidhi",2);
    map.put("kolar",3);
    System.out.println(map);
    System.out.println("size is:"+map.size());
    for(Entry<String,Integer> entry:map.entrySet()){
System.out.println("keys="+entry.getKey()+" values="+entry.getValue());
    }
  }
}