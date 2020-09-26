import java.util.*;
public class SetsExample {
    public static void main(String[] args){

        HashSet<Integer>s1=new HashSet<Integer>();
        HashSet<Integer>s2=new HashSet<Integer>();
        HashSet<Integer>s3=new HashSet<Integer>();

        s1.add(1);
        s1.add(3);
        s1.add(4);
        s1.add(5);
        s1.add(6);
        
        s2.add(2);
        s2.add(4);
        s2.add(6);

        s3.add(3);
        s3.add(6);
        s3.add(7);
        s3.add(8);

        s1.remove(1);

        s1.addAll(s2);
        System.out.println(s1);
        s3.retainAll(s1); 
        System.out.println(s3);
        
        s1.removeAll(s2); 
        System.out.println(s1);
        
        s1.size();
        s1.isEmpty();
        
        s1.contains(1); 

        s1.clear(); 

        for(int i:s2){
            System.out.println(i);
        }

    }
}