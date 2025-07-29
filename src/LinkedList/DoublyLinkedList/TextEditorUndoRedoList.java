package LinkedList.DoublyLinkedList;


public class TextEditorUndoRedoList {
    static class StateNode {
        String textState;
        StateNode next, prev;
        StateNode(String textState) {
            this.textState = textState;
        }
    }
    private StateNode head, tail, current;
    private int size = 0, maxSize = 10;

    public void addState(String text) {
        StateNode newNode = new StateNode(text);
        if (head == null) {
            head = tail = current = newNode;
            size = 1;
            return;
        }
        while (current != tail) {
            tail = tail.prev;
            tail.next = null;
            size--;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        current = newNode;
        size++;
        if (size > maxSize) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void undo() {
        if (current != null && current.prev != null) current = current.prev;
    }

    public void redo() {
        if (current != null && current.next != null) current = current.next;
    }

    public void displayCurrent() {
        if (current != null)
            System.out.println("Current: " + current.textState);
        else
            System.out.println("No state.");
    }

    public static void main(String[] args) {
        TextEditorUndoRedoList editor = new TextEditorUndoRedoList();
        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");
        editor.displayCurrent();
        editor.undo();
        editor.displayCurrent();
        editor.redo();
        editor.displayCurrent();
    }
}