package java.demo.com.PicPay.services.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.demo.com.PicPay.domain.dtos.NotificationDTO;
import java.demo.com.PicPay.domain.users.User;
import java.demo.com.PicPay.services.NotificationService;

@Service
@RequiredArgsConstructor
public class NotificationServiceImpl implements NotificationService {
    private final RestTemplate restTemplate;

    @Override
    public void sendNotification(User user, String message) {
        String userEmail = user.getEmail();
        NotificationDTO notificationDTO = new NotificationDTO(userEmail, message);

        ResponseEntity<String> stringResponseEntity = this.restTemplate.postForEntity("https://run.mocky.io/v3/54dc2cf1-3add-45b5-b5a9-6bf7e7f1f4a6", notificationDTO, String.class);

        if (!(stringResponseEntity.getStatusCode() == HttpStatus.OK)) throw new RuntimeException("unavailable service");
    }
}
