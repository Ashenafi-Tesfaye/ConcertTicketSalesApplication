package ITEC6309042.com.ConcertTicketSalesApplication.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentGatewayDto {
    private String name;
    private String type;
    private String apiKey;

    // Constructors, getters, and setters
}