package Stack;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[] = {4, 5, 2, 25};
        //algorithm
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        int popped;
        int next;
        for (int i = 1; i < arr.length; i++) {
            if (!stack.isEmpty()) {
                popped = stack.pop();
                next = arr[i];
                if (popped < next) {
                    do {
                        System.out.println(popped + "-->" + next);
                        if (stack.isEmpty())
                            break;
                        popped = stack.pop();
                    } while (stack.isEmpty() && popped < next);
                }
                stack.push(next);
                if (popped > next)
                    stack.push(popped);
            }
        }
        while (!stack.isEmpty())
            System.out.println(stack.pop() + "-->" + -1);

    }
}
