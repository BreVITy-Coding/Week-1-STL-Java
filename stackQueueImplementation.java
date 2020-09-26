import java.util.*;
public class stackQueueImplementation {
    public static void main(String[] args){
        
        Deque<Integer>stack=new LinkedList<Integer>();

        stack.addFirst(1);
        stack.addFirst(2);
        stack.addFirst(3);
        stack.addFirst(4);
        stack.addFirst(5);
        
        System.out.println(stack);

        stack.removeFirst();
        stack.removeFirst();
        System.out.println(stack);

        System.out.println(stack.peek());


        Deque<Integer>queue=new LinkedList<Integer>();

        queue.addLast(1);
        queue.addLast(2);
        queue.addLast(3);
        queue.addLast(4);
        queue.addLast(5);
        System.out.println(queue);

        queue.removeFirst();
        queue.removeFirst();
        System.out.println(queue);

        queue.poll();
        System.out.println(queue);

        System.out.println(queue.peek());
}
}
