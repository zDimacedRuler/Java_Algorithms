import java.util.Scanner;

public class SumInTree {
    private static Node head;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ch = "y";
        System.out.println("Enter 1 to Insert");
        System.out.println("Enter 2 to Display List");
        int type;
        head = null;
        while (ch.equals("y")) {
            System.out.println("Enter your choice:");
            type = scanner.nextInt();
            switch (type) {
                case 1:
                    System.out.println("Enter data value:");
                    int val = scanner.nextInt();
                    insert(val);
                    break;
                case 2:
                    display();
                    break;
                default:
                    System.out.println("Wrong choice!!");
                    break;
            }
            System.out.println("Continue?");
            ch = scanner.next();
        }
    }

    private static void display() {
        if (head == null) {
            System.out.println("No values!!");
            return;
        }
        System.out.println("The data values are:");
        Node temp = head;
        while (temp != null) {
            if (temp.next != null)
                System.out.print(temp.data + "-->");
            else
                System.out.print(temp.data);

            temp = temp.next;
        }
        System.out.println();
    }

    private static void insert(int val) {
        Node node = new Node();
        node.data = val;
        node.next = head;
        head = node;
    }
}

class Node {
    int data;
    Node next;
}
