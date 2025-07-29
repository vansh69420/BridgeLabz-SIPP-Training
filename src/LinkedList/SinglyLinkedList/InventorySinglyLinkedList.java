package LinkedList.SinglyLinkedList;


public class InventorySinglyLinkedList {
    static class ItemNode {
        String itemName;
        int itemId, quantity;
        double price;
        ItemNode next;
        ItemNode(String itemName, int itemId, int quantity, double price) {
            this.itemName = itemName;
            this.itemId = itemId;
            this.quantity = quantity;
            this.price = price;
        }
    }
    private ItemNode head;

    public void addAtBeginning(String itemName, int itemId, int quantity, double price) {
        ItemNode newNode = new ItemNode(itemName, itemId, quantity, price);
        newNode.next = head;
        head = newNode;
    }

    public void addAtEnd(String itemName, int itemId, int quantity, double price) {
        ItemNode newNode = new ItemNode(itemName, itemId, quantity, price);
        if (head == null) {
            head = newNode;
            return;
        }
        ItemNode temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    public void addAtPosition(int pos, String itemName, int itemId, int quantity, double price) {
        if (pos <= 1) {
            addAtBeginning(itemName, itemId, quantity, price);
            return;
        }
        ItemNode temp = head;
        for (int i = 1; temp != null && i < pos - 1; i++) temp = temp.next;
        if (temp == null || temp.next == null) {
            addAtEnd(itemName, itemId, quantity, price);
            return;
        }
        ItemNode newNode = new ItemNode(itemName, itemId, quantity, price);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void removeByItemId(int itemId) {
        if (head == null) return;
        if (head.itemId == itemId) {
            head = head.next;
            return;
        }
        ItemNode temp = head;
        while (temp.next != null && temp.next.itemId != itemId) temp = temp.next;
        if (temp.next != null) temp.next = temp.next.next;
    }

    public void updateQuantity(int itemId, int newQuantity) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                temp.quantity = newQuantity;
                return;
            }
            temp = temp.next;
        }
    }

    public void searchByItemId(int itemId) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == itemId)
                System.out.println(temp.itemName + " | " + temp.quantity + " | " + temp.price);
            temp = temp.next;
        }
    }
    public void searchByItemName(String itemName) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemName.equals(itemName))
                System.out.println(temp.itemId + " | " + temp.quantity + " | " + temp.price);
            temp = temp.next;
        }
    }

    public void totalValue() {
        double sum = 0;
        ItemNode temp = head;
        while (temp != null) {
            sum += temp.quantity * temp.price;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: " + sum);
    }

    public void displayAll() {
        ItemNode temp = head;
        while (temp != null) {
            System.out.println(temp.itemName + " | " + temp.itemId + " | " + temp.quantity + " | " + temp.price);
            temp = temp.next;
        }
    }

    // Merge sort for sorting by itemName or price
    public void sortByName(boolean ascending) {
        head = mergeSortByName(head, ascending);
    }
    private ItemNode mergeSortByName(ItemNode node, boolean ascending) {
        if (node == null || node.next == null) return node;
        ItemNode mid = getMiddle(node);
        ItemNode nextOfMid = mid.next;
        mid.next = null;
        ItemNode left = mergeSortByName(node, ascending);
        ItemNode right = mergeSortByName(nextOfMid, ascending);
        return sortedMergeByName(left, right, ascending);
    }
    private ItemNode sortedMergeByName(ItemNode a, ItemNode b, boolean ascending) {
        if (a == null) return b;
        if (b == null) return a;
        int cmp = a.itemName.compareTo(b.itemName);
        if ((ascending && cmp <= 0) || (!ascending && cmp > 0)) {
            a.next = sortedMergeByName(a.next, b, ascending);
            return a;
        } else {
            b.next = sortedMergeByName(a, b.next, ascending);
            return b;
        }
    }
    private ItemNode getMiddle(ItemNode node) {
        if (node == null) return node;
        ItemNode slow = node, fast = node.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void sortByPrice(boolean ascending) {
        head = mergeSortByPrice(head, ascending);
    }
    private ItemNode mergeSortByPrice(ItemNode node, boolean ascending) {
        if (node == null || node.next == null) return node;
        ItemNode mid = getMiddle(node);
        ItemNode nextOfMid = mid.next;
        mid.next = null;
        ItemNode left = mergeSortByPrice(node, ascending);
        ItemNode right = mergeSortByPrice(nextOfMid, ascending);
        return sortedMergeByPrice(left, right, ascending);
    }
    private ItemNode sortedMergeByPrice(ItemNode a, ItemNode b, boolean ascending) {
        if (a == null) return b;
        if (b == null) return a;
        if ((ascending && a.price <= b.price) || (!ascending && a.price > b.price)) {
            a.next = sortedMergeByPrice(a.next, b, ascending);
            return a;
        } else {
            b.next = sortedMergeByPrice(a, b.next, ascending);
            return b;
        }
    }

    public static void main(String[] args) {
        InventorySinglyLinkedList list = new InventorySinglyLinkedList();
        list.addAtEnd("Pen", 1, 100, 5.0);
        list.addAtBeginning("Book", 2, 50, 20.0);
        list.addAtPosition(2, "Pencil", 3, 200, 2.0);
        list.displayAll();
        list.updateQuantity(2, 60);
        list.removeByItemId(3);
        System.out.println("After update and remove:");
        list.displayAll();
        list.totalValue();
        System.out.println("Sort by name ascending:");
        list.sortByName(true);
        list.displayAll();
        System.out.println("Sort by price descending:");
        list.sortByPrice(false);
        list.displayAll();
    }
}
