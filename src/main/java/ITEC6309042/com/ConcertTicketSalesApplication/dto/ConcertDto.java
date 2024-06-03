package ITEC6309042.com.ConcertTicketSalesApplication.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ConcertDto {
    private String artist;
    private String venue;
    private Date date;
    private String time;
    private String description;
    private double ticketPrice;
    private int availableTickets;
    private PaymentGatewayDto paymentGateway;

    // Getters and setters
}