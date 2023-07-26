public class Queue_implementaion_usingLinkedlist {
    public static class Queue {
        public static class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }

        }

        public static Node head;
        public static Node tail;

        // isEmpty()
        public static boolean isEmpty() {
            return head == null & tail == null;
        }

        // add()
        public static void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // remove()
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }
            int res = head.data;
            if (head == tail) {
                head = tail = null;
            }
            head = head.next;
            return res;
        }

        // print()
        public static void print() {
            if (isEmpty()) {
                System.out.println("Empty");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println("null");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(11);
        q.add(22);
        q.add(33);

        q.print();
        q.remove();
        q.print();
        q.add(44);
        q.print();
        q.remove();
        q.remove();
        q.print();
    }
}
