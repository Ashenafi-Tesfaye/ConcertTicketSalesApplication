package ITEC6309042.com.ConcertTicketSalesApplication.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TicketDto {
    private String userId;
    private String customerId;
    private String concertId;
    private int quantity;
    private List<RecipientDto> recipients;

    // Getters and setters
}