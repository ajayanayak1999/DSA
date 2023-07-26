import java.util.*;

//using statck
public class Reversing_The_First_K_Elements_Of_A_Queue {
    public static Queue<Integer> reveseFirst_K_Elements1(Queue<Integer> q, int k) {
        if (!q.isEmpty() && k < q.size() && k > 0) {

            // Queue<Integer> newQueue = new LinkedList<>();
            Stack<Integer> s = new Stack<>();

            for (int i = 0; i < k; i++) {
                s.push(q.peek());
                q.remove();
            }
            while (!s.isEmpty()) {
                q.add(s.peek());
                s.pop();
            }
            for (int i = 0; i < q.size() - k; i++) {
                q.add(q.peek());
                q.remove();
            }
        }
        return q;
    }
    // TC:O(n+k) where n is the total number of elements in the queue and 'k' is the
    // number of eleemnts to to reversed.
    // SC:O(k): where k is the number of elements to be reversed sience stack is
    // being stored values for the purpose of reveseing.

    // optimized approach using Deque..
    public static Queue<Integer> reveseFirst_K_Elements2(Queue<Integer> q, int k) {
        if (!q.isEmpty() && k < q.size() && k > 0) {

            Deque<Integer> deque = new LinkedList<>();
            // remove the k elements from the queue..
            for (int i = 0; i < k; i++) {
                deque.add(q.peek());
                q.remove();
            }
            while (!deque.isEmpty()) {
                q.add(deque.getLast());
                deque.removeLast();
            }
            for (int i = 0; i < q.size() - k; i++) {
                q.add(q.peek());
                q.remove();
            }

        }
        return q;
    }
    // TC:O(n) where n is the total number of elements in the queue
    // SC:O(k): where k is the number of elements to be reversed and we us a deque

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);

        Queue<Integer> q1 = reveseFirst_K_Elements1(q, 5);
        if (q1 != null) {
            while (!q1.isEmpty()) {
                System.out.print(q1.remove() + " ");
            }
        }
    }
}
