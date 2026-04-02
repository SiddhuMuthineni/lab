class Notifier {

        public void send(String message) {
        System.out.println("General Notification: " + message);
        logNotification(message); // calling private method internally
    }

        protected void send(String message, String email) {
        System.out.println("Email sent to " + email + ": " + message);
    }

    
    void send(String message, long phoneNumber) {
        System.out.println("SMS sent to " + phoneNumber + ": " + message);
    }

       private void logNotification(String message) {
        System.out.println("(Log): Notification stored -> " + message);
    }
}


class AppNotifier extends Notifier {

    public void testMethods() {

        
        send("Welcome User"); // public
        send("Check your mail", "user@gmail.com"); // protected
        send("OTP Code", 9876543210L); // default

        
    }
}

public class NotificationSystem {
    public static void main(String[] args) {

        AppNotifier app = new AppNotifier();

        app.testMethods();

               app.send("System Alert");
        app.send("Email Alert", "admin@gmail.com");
        app.send("SMS Alert", 9999999999L);
    }
}