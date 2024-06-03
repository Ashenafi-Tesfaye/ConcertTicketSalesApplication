package ITEC6309042.com.ConcertTicketSalesApplication.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotificationDto {
    private String recipient;
    private String subject;
    private String content;
    private Long userId;
    private Long concertId;

    // Getters and setters
}