package StackAndQueues;

import java.util.Stack;

public class QueueUsingStacks<T> {
    private Stack<T> stackEnq = new Stack<>();
    private Stack<T> stackDeq = new Stack<>();

    public void enqueue(T x) {
        stackEnq.push(x);
    }

    public T dequeue() {
        if (stackDeq.isEmpty()) {
            while (!stackEnq.isEmpty()) {
                stackDeq.push(stackEnq.pop());
            }
        }
        if (stackDeq.isEmpty()) throw new RuntimeException("Queue is empty");
        return stackDeq.pop();
    }

    public static void main(String[] args) {
        QueueUsingStacks<Integer> q = new QueueUsingStacks<>();
        q.enqueue(1); q.enqueue(2); q.enqueue(3);
        System.out.println(q.dequeue()); // 1
        q.enqueue(4);
        System.out.println(q.dequeue()); // 2
    }
}