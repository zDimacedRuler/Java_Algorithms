package Recursion;

import java.util.Stack;

public class ReverseStack {
    private static Stack<Integer> stack = new Stack<>();
    public static void main(String[] args) {
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);
        System.out.println(stack);
        stackReverse();
        System.out.println(stack);
    }

    private static void stackReverse() {
        if (stack.isEmpty())
            return;
        int x = stack.pop();
        stackReverse();
        addToBottom(x);
    }

    private static void addToBottom(int x) {
        if (stack.isEmpty())
            stack.push(x);
        else{
            int y = stack.pop();
            addToBottom(x);
            stack.push(y);
        }
    }
}
