package LinkedList.CircularLinkedList;

public class RoundRobinCircularList {
    static class ProcessNode {
        int processId, burstTime, priority, waitingTime = 0, turnAroundTime = 0;
        ProcessNode next;
        ProcessNode(int processId, int burstTime, int priority) {
            this.processId = processId;
            this.burstTime = burstTime;
            this.priority = priority;
        }
    }
    private ProcessNode head = null;

    public void addAtEnd(int processId, int burstTime, int priority) {
        ProcessNode newNode = new ProcessNode(processId, burstTime, priority);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }
        ProcessNode temp = head;
        while (temp.next != head) temp = temp.next;
        temp.next = newNode;
        newNode.next = head;
    }

    public void removeByProcessId(int processId) {
        if (head == null) return;
        if (head.processId == processId) {
            if (head.next == head) {
                head = null;
                return;
            }
            ProcessNode temp = head;
            while (temp.next != head) temp = temp.next;
            temp.next = head.next;
            head = head.next;
            return;
        }
        ProcessNode temp = head;
        while (temp.next != head && temp.next.processId != processId) temp = temp.next;
        if (temp.next.processId == processId) temp.next = temp.next.next;
    }

    public void simulate(int timeQuantum) {
        if (head == null) return;
        ProcessNode temp = head;
        int time = 0;
        boolean done;
        do {
            done = true;
            ProcessNode curr = head;
            do {
                if (curr.burstTime > 0) {
                    done = false;
                    if (curr.burstTime > timeQuantum) {
                        time += timeQuantum;
                        curr.burstTime -= timeQuantum;
                    } else {
                        time += curr.burstTime;
                        curr.waitingTime = time - curr.burstTime;
                        curr.turnAroundTime = time;
                        curr.burstTime = 0;
                    }
                }
                curr = curr.next;
            } while (curr != head);
        } while (!done);
        displayAll();
        calculateAvgTimes();
    }

    public void displayAll() {
        if (head == null) return;
        ProcessNode temp = head;
        do {
            System.out.println("PID: " + temp.processId + " | Priority: " + temp.priority +
                    " | Waiting: " + temp.waitingTime + " | Turnaround: " + temp.turnAroundTime);
            temp = temp.next;
        } while (temp != head);
    }

    public void calculateAvgTimes() {
        if (head == null) return;
        int totalWaiting = 0, totalTurnAround = 0, count = 0;
        ProcessNode temp = head;
        do {
            totalWaiting += temp.waitingTime;
            totalTurnAround += temp.turnAroundTime;
            count++;
            temp = temp.next;
        } while (temp != head);
        System.out.println("Avg Waiting: " + (double)totalWaiting/count +
                ", Avg Turnaround: " + (double)totalTurnAround/count);
    }

    public static void main(String[] args) {
        RoundRobinCircularList list = new RoundRobinCircularList();
        list.addAtEnd(1, 10, 1);
        list.addAtEnd(2, 5, 2);
        list.addAtEnd(3, 8, 1);
        list.simulate(3);
    }
}