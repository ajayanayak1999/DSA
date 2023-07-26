class Queue_implementaion_usingArray {
    static class Queue {
        static int arr[];
        static int rear;
        static int size;

        public Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        // isEmpty()
        public static boolean isEmpty() {
            return rear == -1;
        }

        // add()
        public static void add(int num) {
            if (rear == size - 1) {
                System.out.println("Queue is full!");
                return;
            }
            rear = rear + 1;
            arr[rear] = num;

        }

        // remove()
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }

            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear = rear - 1;
            return front;
        }

        // peek()
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }

            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(4);
        q.add(11);
        q.add(22);
        q.add(33);
        q.add(44);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}