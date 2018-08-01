package LinkedList;

public class PalindromeStack {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(2);
        list.insert(3);
        list.insert(5);
        list.insert(3);
        list.insert(2);
        list.display();
        if(list.checkPalindrome())
            System.out.println("The list is palindrome");
        else
            System.out.println("The list is not palindrome");
    }
}
