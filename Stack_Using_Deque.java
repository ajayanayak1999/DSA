import java.util.*;

public class Stack_Using_Deque {
    public static class Stack {
        static Deque<Integer> deque = new LinkedList<>();

        public static boolean isEmpty() {
            return deque.isEmpty();
        }

        public static void push(int ele) {
            deque.addLast(ele);
        }

        public static int pop() {
            return deque.removeLast();
        }

        public static int peek() {
            return deque.getLast();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(11);
        s.push(22);
        s.push(33);
        s.push(44);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
