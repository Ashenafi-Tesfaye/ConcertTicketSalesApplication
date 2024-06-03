package ITEC6309042.com.ConcertTicketSalesApplication.service.payment;

import ITEC6309042.com.ConcertTicketSalesApplication.dto.PaymentDto;

public interface PaymentService {
    void processPayment(PaymentDto paymentDto);

    boolean processPayment(double amount, String stripePaymentId);
    boolean confirmPayment(String paymentId);
}
