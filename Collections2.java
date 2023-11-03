import java.util.*;
public class Collections2{
  public static void main(String[] args){
    LinkedList arr1=new LinkedList();
    arr1.add("G");
    arr1.add("A");
    LinkedList arr=new LinkedList();
    arr.add("N");
    arr.add("A");
    arr.add("R");
    arr1.addAll(arr);
    System.out.println(arr1.size());
    System.out.println(arr1);
    LinkedList arr2=new LinkedList();
    arr2.add("srinidhi");
    arr1.addAll(arr2);
    System.out.println(arr1);
    System.out.println(arr1.remove("R"));
    System.out.println(arr1);
    Iterator i=arr1.iterator();
    while(i.hasNext()){
      System.out.println(i.next()+" ");
    }
  }
}