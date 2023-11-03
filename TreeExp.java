import java.util.*;

public class TreeExp{
  public static void main(String[] args){
    TreeSet t=new TreeSet();
    t.add(1);
    t.add(0);
    t.add(5);
    t.add(0);
    t.add(10);
    t.add(100);
    System.out.print(t);
    Iterator<Integer> s=t.iterator();
        while (s.hasNext()) {
            System.out.println(s.next());
  }
}