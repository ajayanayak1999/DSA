import java.util.*;

public class Queue_implementaion_usingJCF {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(11);
        q.add(22);
        q.add(33);
        q.add(44);

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
