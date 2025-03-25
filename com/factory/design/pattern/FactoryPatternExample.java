package com.factory.design.pattern;

public class FactoryPatternExample {
    public static void main(String[] args) {
       Notification notification = NotificationFactory.createNotification("email");
       notification.notifyUser();
    }
}
