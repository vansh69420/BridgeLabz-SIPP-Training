package LinkedList.SinglyLinkedList;

import java.util.ArrayList;

public class SocialMediaFriendList {
    static class UserNode {
        int userId, age;
        String name;
        ArrayList<Integer> friendIds;
        UserNode next;
        UserNode(int userId, String name, int age) {
            this.userId = userId;
            this.name = name;
            this.age = age;
            this.friendIds = new ArrayList<>();
        }
    }
    private UserNode head;

    public void addUser(int userId, String name, int age) {
        UserNode newNode = new UserNode(userId, name, age);
        newNode.next = head;
        head = newNode;
    }

    public void addFriend(int userId, int friendId) {
        UserNode user = searchByUserId(userId);
        if (user != null && !user.friendIds.contains(friendId)) user.friendIds.add(friendId);
    }

    public void removeFriend(int userId, int friendId) {
        UserNode user = searchByUserId(userId);
        if (user != null) user.friendIds.remove(Integer.valueOf(friendId));
    }

    public void mutualFriends(int userId1, int userId2) {
        UserNode user1 = searchByUserId(userId1);
        UserNode user2 = searchByUserId(userId2);
        if (user1 == null || user2 == null) return;
        System.out.print("Mutual friends: ");
        for (int id : user1.friendIds)
            if (user2.friendIds.contains(id)) System.out.print(id + " ");
        System.out.println();
    }

    public void displayFriends(int userId) {
        UserNode user = searchByUserId(userId);
        if (user == null) return;
        System.out.print("Friends of " + user.name + ": ");
        for (int id : user.friendIds) System.out.print(id + " ");
        System.out.println();
    }

    public UserNode searchByUserId(int userId) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == userId) return temp;
            temp = temp.next;
        }
        return null;
    }
    public void searchByName(String name) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.name.equals(name))
                System.out.println(temp.userId + " | " + temp.age);
            temp = temp.next;
        }
    }

    public void countFriends() {
        UserNode temp = head;
        while (temp != null) {
            System.out.println(temp.name + " has " + temp.friendIds.size() + " friends.");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        SocialMediaFriendList list = new SocialMediaFriendList();
        list.addUser(1, "Alice", 20);
        list.addUser(2, "Bob", 21);
        list.addUser(3, "Charlie", 22);
        list.addFriend(1, 2);
        list.addFriend(1, 3);
        list.addFriend(2, 3);
        list.displayFriends(1);
        list.displayFriends(2);
        list.mutualFriends(1, 2);
        list.countFriends();
        System.out.println("Search by name Bob:");
        list.searchByName("Bob");
    }
}
