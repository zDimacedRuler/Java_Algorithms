package LinkedList;

public class MiddleElement {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for (int i = 0; i < 10; i++) {
            list.insert(i);
            list.display();
            list.findMiddle();
        }
    }
}