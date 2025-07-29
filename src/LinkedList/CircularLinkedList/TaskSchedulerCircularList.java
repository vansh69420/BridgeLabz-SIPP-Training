package LinkedList.CircularLinkedList;

public class TaskSchedulerCircularList {
    static class TaskNode {
        int taskId, priority;
        String taskName, dueDate;
        TaskNode next;
        TaskNode(int taskId, String taskName, int priority, String dueDate) {
            this.taskId = taskId;
            this.taskName = taskName;
            this.priority = priority;
            this.dueDate = dueDate;
        }
    }
    private TaskNode head = null, current = null;

    public void addAtBeginning(int taskId, String taskName, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
            return;
        }
        TaskNode temp = head;
        while (temp.next != head) temp = temp.next;
        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }

    public void addAtEnd(int taskId, String taskName, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
            return;
        }
        TaskNode temp = head;
        while (temp.next != head) temp = temp.next;
        temp.next = newNode;
        newNode.next = head;
    }

    public void addAtPosition(int pos, int taskId, String taskName, int priority, String dueDate) {
        if (pos <= 1 || head == null) {
            addAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }
        TaskNode temp = head;
        for (int i = 1; temp.next != head && i < pos - 1; i++) temp = temp.next;
        TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void removeByTaskId(int taskId) {
        if (head == null) return;
        if (head.taskId == taskId) {
            if (head.next == head) {
                head = null;
                current = null;
                return;
            }
            TaskNode temp = head;
            while (temp.next != head) temp = temp.next;
            temp.next = head.next;
            head = head.next;
            return;
        }
        TaskNode temp = head;
        while (temp.next != head && temp.next.taskId != taskId) temp = temp.next;
        if (temp.next.taskId == taskId) temp.next = temp.next.next;
    }

    public void viewCurrentAndMoveNext() {
        if (current == null) return;
        System.out.println("Current Task: " + current.taskId + " | " + current.taskName + " | " + current.priority + " | " + current.dueDate);
        current = current.next;
    }

    public void displayAll() {
        if (head == null) return;
        TaskNode temp = head;
        do {
            System.out.println(temp.taskId + " | " + temp.taskName + " | " + temp.priority + " | " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    public void searchByPriority(int priority) {
        if (head == null) return;
        TaskNode temp = head;
        do {
            if (temp.priority == priority)
                System.out.println(temp.taskId + " | " + temp.taskName + " | " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        TaskSchedulerCircularList list = new TaskSchedulerCircularList();
        list.addAtEnd(1, "Task1", 2, "2025-07-10");
        list.addAtBeginning(2, "Task2", 1, "2025-07-09");
        list.addAtPosition(2, 3, "Task3", 3, "2025-07-11");
        list.displayAll();
        System.out.println("View and move:");
        list.viewCurrentAndMoveNext();
        list.viewCurrentAndMoveNext();
        list.removeByTaskId(2);
        System.out.println("After remove:");
        list.displayAll();
        System.out.println("Search by priority 3:");
        list.searchByPriority(3);
    }
}
