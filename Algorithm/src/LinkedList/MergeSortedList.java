package LinkedList;

public class MergeSortedList {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        list1.insert(5);
        list1.insert(3);
        list1.insert(1);
        list2.insert(6);
        list2.insert(4);
        list2.insert(2);
        list1.display();
        list2.display();
        list1.merge(list2.getHead());
        list1.display();
    }
}