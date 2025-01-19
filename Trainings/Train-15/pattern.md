Pattern : Strategy

Context : NotificationService
Strategy : Notification
    execute() : send()
ConcreteStrategy : EmailNotification, SMSNotification, PushNotification
    execute() : send()