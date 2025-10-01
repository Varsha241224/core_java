package interfacedemo;

interface NotificationService {
    void notifyUser(String message);
}

class EmailNotification implements NotificationService {
    @Override
    public void notifyUser(String message) {
        System.out.println("Sending Email: " + message);
    }
}

class SMSNotification implements NotificationService {
    @Override
    public void notifyUser(String message) {
        System.out.println("Sending SMS: " + message);
    }
}


public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        NotificationService email = new EmailNotification();
        NotificationService sms = new SMSNotification();
        
        email.notifyUser("Assignment Uploaded");
        sms.notifyUser("Class at 10am");
    }
}
