import java.util.*;

public class Deque_using_JCF {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        deque.addFirst(11);
        deque.addFirst(22);
        deque.addFirst(33);
        deque.addFirst(44);

        System.out.print(deque);

        deque.removeFirst();
        deque.removeLast();

        deque.addLast(11);
        deque.addLast(22);
        deque.addLast(33);
        deque.addLast(44);
        System.out.println();
        System.out.println(deque);
    }
}
