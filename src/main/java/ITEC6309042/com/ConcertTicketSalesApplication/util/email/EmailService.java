package ITEC6309042.com.ConcertTicketSalesApplication.util.email;

public interface EmailService {
    void sendEmail(String recipient, String subject, String content);
}
