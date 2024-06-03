package ITEC6309042.com.ConcertTicketSalesApplication.util.email;

class SMTPService implements EmailService {
    @Override
    public void sendEmail(String recipient, String subject, String content) {
        System.out.println("Sending email to: " + recipient);
        System.out.println("Subject: " + subject);
        System.out.println("Content: " + content);
        // TODO: Replace with actual SMTP service logic
    }
}
