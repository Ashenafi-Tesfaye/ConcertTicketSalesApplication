package ITEC6309042.com.ConcertTicketSalesApplication.service.payment;

import ITEC6309042.com.ConcertTicketSalesApplication.dto.PaymentDto;
import org.springframework.stereotype.Component;

@Component
public class StripePaymentProcessor implements PaymentProcessor {

    @Override
    public void processPayment(PaymentDto paymentDto) {

    }

    @Override
    public boolean confirmPayment(String paymentId) {
        return false;
    }
}