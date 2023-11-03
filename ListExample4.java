import java.util.*;
public class ListExample4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter String1");
        String s1=s.nextLine();
        System.out.println("Enter String2");
        String s2=s.nextLine();
        System.out.println("Enter String3");
        String s3=s.nextLine();
        List<String> l=new ArrayList<>();
        l.add(s1);
        l.add(s2);
        l.add(s3);
        System.out.println("Iterate using for loop");
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));}
            System.out.println("Iterate using for each loop");
            for(String b:l){
                System.out.println(b);}
                System.out.println("Iterate using while loop");
                int i=0;
            while(i<l.size()){
                System.out.println(l.get(i));
                i++;}
                System.out.println("Iterate using do while loop");
                int t=0;
                do{
                   System.out.println(t); 
                }while(t<l.size());
            System.out.println("Iterate using iterator interface");
            Iterator<String> b=l.iterator();
            while(b.hasNext()){
                System.out.println(b.next());
            }
    }
}