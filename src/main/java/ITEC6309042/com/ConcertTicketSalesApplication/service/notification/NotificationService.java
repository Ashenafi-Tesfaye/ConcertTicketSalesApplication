package ITEC6309042.com.ConcertTicketSalesApplication.service.notification;

import ITEC6309042.com.ConcertTicketSalesApplication.dto.NotificationDto;
import ITEC6309042.com.ConcertTicketSalesApplication.model.Notification;

public interface NotificationService {
    void sendNotification(String recipient, String subject, String content);
    Notification createNotification(NotificationDto notificationDto);
}