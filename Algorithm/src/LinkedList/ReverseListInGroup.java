package LinkedList;

import java.util.Random;

public class ReverseListInGroup {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            int val = random.nextInt(100);
            list.insert(val);
        }
        list.display();
        list.reverseListInGroup(3);
        list.display();
    }
}
