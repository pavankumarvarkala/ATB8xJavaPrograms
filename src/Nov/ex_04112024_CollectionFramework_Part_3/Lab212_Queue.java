package Nov.ex_04112024_CollectionFramework_Part_3;

import java.util.PriorityQueue;

public class Lab212_Queue {
    public static void main(String[] args) {

        PriorityQueue pq=new PriorityQueue();
        pq.offer("1");
        pq.offer("3");
        pq.offer("2");
        pq.offer("4");
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);

    }
}
