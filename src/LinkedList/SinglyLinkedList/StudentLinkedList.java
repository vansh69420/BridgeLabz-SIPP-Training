package LinkedList.SinglyLinkedList;


public class StudentLinkedList {
    static class StudentNode {
        int rollNumber;
        String name;
        int age;
        String grade;
        StudentNode next;

        StudentNode(int rollNumber, String name, int age, String grade) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.age = age;
            this.grade = grade;
            this.next = null;
        }
    }

    private StudentNode head;

    // Add at beginning
    public void addAtBeginning(int rollNumber, String name, int age, String grade) {
        StudentNode newNode = new StudentNode(rollNumber, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    // Add at end
    public void addAtEnd(int rollNumber, String name, int age, String grade) {
        StudentNode newNode = new StudentNode(rollNumber, name, age, grade);
        if (head == null) {
            head = newNode;
            return;
        }
        StudentNode temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    // Add at specific position (1-based index)
    public void addAtPosition(int pos, int rollNumber, String name, int age, String grade) {
        if (pos <= 1) {
            addAtBeginning(rollNumber, name, age, grade);
            return;
        }
        StudentNode newNode = new StudentNode(rollNumber, name, age, grade);
        StudentNode temp = head;
        for (int i = 1; temp != null && i < pos - 1; i++) temp = temp.next;
        if (temp == null) {
            addAtEnd(rollNumber, name, age, grade);
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete by Roll Number
    public void deleteByRollNumber(int rollNumber) {
        if (head == null) return;
        if (head.rollNumber == rollNumber) {
            head = head.next;
            return;
        }
        StudentNode temp = head;
        while (temp.next != null && temp.next.rollNumber != rollNumber) temp = temp.next;
        if (temp.next != null) temp.next = temp.next.next;
    }

    // Search by Roll Number
    public StudentNode searchByRollNumber(int rollNumber) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) return temp;
            temp = temp.next;
        }
        return null;
    }

    // Update grade by Roll Number
    public void updateGrade(int rollNumber, String newGrade) {
        StudentNode node = searchByRollNumber(rollNumber);
        if (node != null) node.grade = newGrade;
    }

    // Display all records
    public void displayAll() {
        StudentNode temp = head;
        while (temp != null) {
            System.out.println("Roll: " + temp.rollNumber + ", Name: " + temp.name +
                    ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }

    // Example usage
    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();
        list.addAtEnd(1, "Vansh", 20, "A");
        list.addAtBeginning(2, "Hemant", 21, "B");
        list.addAtPosition(2, 3, "Sheelesh", 19, "C");
        list.displayAll();
        list.updateGrade(2, "A+");
        System.out.println("After updating grade:");
        list.displayAll();
        list.deleteByRollNumber(3);
        System.out.println("After deleting roll 3:");
        list.displayAll();
    }
}
