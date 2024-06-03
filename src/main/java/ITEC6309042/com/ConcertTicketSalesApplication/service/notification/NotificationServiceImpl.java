package ITEC6309042.com.ConcertTicketSalesApplication.service.notification;

import ITEC6309042.com.ConcertTicketSalesApplication.dto.NotificationDto;
import ITEC6309042.com.ConcertTicketSalesApplication.model.Notification;
import ITEC6309042.com.ConcertTicketSalesApplication.repository.NotificationRepository;
import ITEC6309042.com.ConcertTicketSalesApplication.util.email.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceImpl implements NotificationService {
    @Autowired
    private EmailService emailService;
    @Autowired
    private NotificationRepository notificationRepository;

    @Override
    public void sendNotification(String recipient, String subject, String content) {
        // Implementation
    }

	@Override
	public Notification createNotification(NotificationDto notificationDto) {
		// TODO Auto-generated method stub
		return null;
	}
}
