package SocialMediaFeed;
import java.util.*;

abstract class Notification {
 private String message;
 private long timestamp;
 public Notification(String message) {
     this.message = message;
     this.timestamp = System.currentTimeMillis();
 }
 public String getMessage() { return message; }
 public long getTimestamp() { return timestamp; }
 public abstract String getType();
}

class LikeNotification extends Notification {
 public LikeNotification(String user) {
     super(user + " liked your post.");
 }
 @Override
 public String getType() { return "Like"; }
}

class CommentNotification extends Notification {
 public CommentNotification(String user, String comment) {
     super(user + " commented: " + comment);
 }
 @Override
 public String getType() { return "Comment"; }
}

class UserFeed {
 private LinkedList<Notification> feed = new LinkedList<>();

  public void addNotification(Notification notification) {
     feed.addFirst(notification); 
 }

 public void displayFeed() {
     if (feed.isEmpty()) {
         System.out.println("No notifications.");
         return;
     }
     for (Notification n : feed) {
         System.out.println("[" + n.getType() + "] " + n.getMessage());
     }
 }
}

public class NotificationDemo {
 public static void main(String[] args) {
     UserFeed userFeed = new UserFeed();
     userFeed.addNotification(new LikeNotification("Vansh"));
     userFeed.addNotification(new CommentNotification("Suyash", "Nice photo!"));
     userFeed.addNotification(new LikeNotification("Sheelesh"));

     userFeed.displayFeed();
 }
}
