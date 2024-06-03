package ITEC6309042.com.ConcertTicketSalesApplication.dto;

import ITEC6309042.com.ConcertTicketSalesApplication.model.PaymentStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentDto {
	private String userId;
	private String customerId;
	private double amount;
	private PaymentStatus paymentStatus;
	private Long paymentGatewayId;

	// Getters and setters
}