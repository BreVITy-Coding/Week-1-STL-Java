import java.util.*;

class MapsExample{
    public static void main(String[] args){
        
        HashMap<Integer,String> map=new HashMap<Integer,String>();  
        
        map.put(100,"Amit");  
        map.put(101,"Vijay");  
        map.put(102,"Rahul");

        System.out.println(map.get(100));
        
        System.out.println(map.containsKey(101));
        
        System.out.println(map.size());
        
        System.out.println(map);
        
        map.remove(101);
        
        map.put(102, "Robin");
        
        map.isEmpty(); 
        
        System.out.println(map);
        
        
        for(Integer key: map.keySet()){
            System.out.println(key+":"+map.get(key));
        }

    }
}