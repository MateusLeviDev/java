package java.demo.com.PicPay.services;

import java.demo.com.PicPay.domain.users.User;

public interface NotificationService {
    void sendNotification(User user, String message);
}
