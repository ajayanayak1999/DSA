import java.util.*;

public class Interleave_Two_Halves_of_A_Queue {
    public static Queue<Integer> interleave(Queue<Integer> q) {
        Queue<Integer> firstQueue = new LinkedList<>();
        int size = q.size();

        if (!q.isEmpty()) {
            for (int i = 0; i < size / 2; i++) {
                firstQueue.add(q.remove());
            }

            while (!firstQueue.isEmpty()) {
                q.add(firstQueue.remove());
                q.add(q.remove());
            }

        } else {
            System.out.println("Queue is empty!");
        }
        return q;
    }

    public static void main(String[] args) {
        Queue<Integer> inputQueue = new LinkedList<>();
        inputQueue.add(1);
        inputQueue.add(2);
        inputQueue.add(3);
        inputQueue.add(4);
        inputQueue.add(5);
        inputQueue.add(6);
        // inputQueue.add(7);
        // inputQueue.add(8);
        // inputQueue.add(9);
        // inputQueue.add(10);
        Queue<Integer> resQueue = interleave(inputQueue);
        while (!resQueue.isEmpty()) {
            System.out.print(resQueue.peek() + " ");
            resQueue.remove();
        }
    }
}
