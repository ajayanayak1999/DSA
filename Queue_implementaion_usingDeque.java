import java.util.*;

public class Queue_implementaion_usingDeque {
    public static class Queue {
        static Deque<Integer> deque = new LinkedList<>();

        public static boolean isEmpty() {
            return deque.isEmpty();
        }

        public static void add(int ele) {
            deque.addLast(ele);
        }

        public static int remove() {
            return deque.removeFirst();
        }

        public static int peek() {
            return deque.getFirst();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(11);
        q.add(22);
        q.add(33);
        q.add(44);
        q.add(55);
        q.add(66);

        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }

    }
}
