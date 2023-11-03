import java.util.*;

public class Dqueq {
  public static void main(String[] args) {
    Deque<Integer> a = new ArrayDeque<>();
    a.add(10);
    a.add(40);
    a.add(90);
    a.addFirst(10);
    a.addLast(20);
    System.out.println(a);
    a.offerFirst(40);
    System.out.println(a);
    a.offer(100);
    a.offerLast(10000);
    System.out.println(a);
    System.out.println("first element is");
    System.out.println(a.peekFirst());
    System.out.println("last element is");
    System.out.println(a.peekLast());
    
    System.out.println(a);
    System.out.println(a.remove(10));
    System.out.println(a);
    Iterator<Integer> i = a.iterator();
    while (i.hasNext()) {
      System.out.println(i.next());
    }
  }
}

    