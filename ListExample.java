import java.util.*;

public class ListExample {
  public static void main(String[] args) {
    List<String> l = new ArrayList<String>();
    l.add("sri");
    l.add("nidhi");
    l.add("bitlabs");
    System.out.println(l);
    //inserting an element
    l.set(2,"tekworks");
    System.out.println(l);
    //iteration 
    for(String name:l){
      System.out.println(name);
    }
    List<Integer> l2 = new ArrayList<Integer>();
    l2.add(12);
    l2.add(23);
    l2.add(77);
    System.out.println(l2);
    //iteration 
    for(Integer n:l2){
      System.out.println(n);
    }
    
    System.out.println(l2.size());
    System.out.println(l.remove("sri"));
    System.out.println(l.removeAll(l));
    System.out.println(l);
    System.out.println(l2.indexOf(12));
    System.out.println(l2.indexOf(77));
    Iterator i = l.iterator();//forword direction
      while(i.hasNext())//boolean wheater the element is present or not
        {
          System.out.println(i.next()+" ");
        }
    
  }
  
}
