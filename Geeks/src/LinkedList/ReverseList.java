package LinkedList;

import java.util.Random;

public class ReverseList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int val = random.nextInt(100);
            list.insert(val);
        }
        list.display();
        list.iterativeReverse();
        list.display();
        list.recursiveReverse();
        list.display();
    }
}
