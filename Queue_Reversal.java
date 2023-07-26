import java.util.*;

public class Queue_Reversal {
    public static Queue<Integer> revese(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        if (!q.isEmpty()) {
            while (!q.isEmpty()) {
                s.push(q.remove());
            }
            while (!s.isEmpty()) {
                q.add(s.pop());
            }
        } else {
            System.out.println("Queue is empty!");
        }
        return q;

    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        Queue<Integer> q1 = revese(q);
        while (!q1.isEmpty()) {
            System.out.print(q1.peek() + " ");
            q1.remove();
        }
    }
}
