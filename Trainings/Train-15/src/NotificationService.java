public class NotificationService {
    private Notification notification;

    public NotificationService(Notification notification) {
        this.notification = notification;
    }

    public void notify(String message) {
        notification.send(message);
    }
}