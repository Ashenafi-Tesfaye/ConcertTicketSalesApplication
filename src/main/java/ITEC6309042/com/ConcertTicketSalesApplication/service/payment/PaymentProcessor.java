package ITEC6309042.com.ConcertTicketSalesApplication.service.payment;

import ITEC6309042.com.ConcertTicketSalesApplication.dto.PaymentDto;

public interface PaymentProcessor {
    void processPayment(PaymentDto paymentDto);
    boolean confirmPayment(String paymentId);
}
