import java.util.Stack;

public class Queue_implementaion_usingTwoStacks2 {
    public static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s2.isEmpty() && s1.isEmpty();
        }

        public static void add(int data) {
            s1.push(data);

        }

        public static int remove() {
            if (!s1.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                    return s2.pop();
                }
            } else {
                while (!s2.isEmpty()) {
                    s1.push(s2.pop());
                    return s1.pop();
                }
            }

        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            if (!s1.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            } else {
                while (!s2.isEmpty()) {
                    s1.push(s2.pop());
                }
            }
            return s2.peek();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(11);
        q.add(22);
        System.out.println(q.remove());
        q.add(33);
        q.add(44);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();

        }
    }
}
