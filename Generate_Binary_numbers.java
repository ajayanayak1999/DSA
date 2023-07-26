import java.util.*;

public class Generate_Binary_numbers {
    public static void generateBinaryNum(int num) {
        Queue<String> q = new LinkedList<>();
        q.add("1");

        for (int i = 0; i < num; i++) {
            String str1 = q.peek();
            q.remove();
            System.out.println(str1);
            q.add(str1 + "0");
            q.add(str1 + "1");
        }
    }

    public static void main(String[] args) {
        generateBinaryNum(10);
    }
}
