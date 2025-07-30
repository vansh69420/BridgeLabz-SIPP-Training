package StackAndQueues;

import java.util.Stack;

public class SortStackRecursively {
    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int x = stack.pop();
            sortStack(stack);
            insertSorted(stack, x);
        }
    }

    private static void insertSorted(Stack<Integer> stack, int x) {
        if (stack.isEmpty() || stack.peek() <= x) {
            stack.push(x);
        } else {
            int temp = stack.pop();
            insertSorted(stack, x);
            stack.push(temp);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3); s.push(1); s.push(4); s.push(2);
        sortStack(s);
        while (!s.isEmpty()) System.out.print(s.pop() + " "); // 1 2 3 4
    }
}