import java.util.*;

public class arrayListIntroduction{
    public static void main(String[] args){

        int[] array=new int[10];

        ArrayList<Integer>l1=new ArrayList<Integer>();

        l1.add(1);

        for(int i=0;i<10;i++){
            array[i]=i;
        }

        for(int i=3;i<10;i++){
            l1.add(i);
        }

        System.out.println(l1);

        l1.add(1,2);
        
        System.out.println(l1);
        
        System.out.println(array[5]);
        System.out.println(l1.get(5));
        
        array[5]=100;
        l1.set(5,100);

        System.out.println(l1.indexOf(3));
        System.out.println(l1.lastIndexOf(2));

        l1.remove(1);

        // System.out.println(l1);

        System.out.println(l1.size());

        l1.clear();

        System.out.println(l1.isEmpty());
        
        for(int i=10;i>=0;i--)
        l1.add(i);

        System.out.println(l1);
        
        Arrays.sort(array);

        Collections.sort(l1);

        System.out.println(l1);

        Collections.reverse(l1);
        // System.out.println(l1);
    }
}