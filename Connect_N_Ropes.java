import java.util.*;

public class Connect_N_Ropes {
    public static int minCost(int arr[]) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pQueue.add(arr[i]);
        }

        int minCost = 0;
        while (pQueue.size() > 1) {
            int cost1 = pQueue.poll();
            int cost2 = pQueue.poll();
            int sum = cost1 + cost2;
            minCost += sum;
            pQueue.add(sum);

        }
        return minCost;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        System.out.println(minCost(arr));
    }
}
