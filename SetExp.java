import java.util.*;

public class SetExp{
  public static void main(String[] args){
    HashSet s=new HashSet();//no order
    s.add(31);
    s.add(32);
    s.add(33);
    s.add(34);
    s.add(35);
    System.out.println(s);
    HashSet s2=new LinkedHashSet();//ordered 
    s2.add(31);
    s2.add(32);
    s2.add(33);
    s2.add(34);
    s2.add(35);
    System.out.println(s2);
    s2.remove(32);
    System.out.println("after removal:"+s2);
    Iterator<Integer> i = s.iterator();
        while (i.hasNext())
            System.out.println(i.next());



  }
}