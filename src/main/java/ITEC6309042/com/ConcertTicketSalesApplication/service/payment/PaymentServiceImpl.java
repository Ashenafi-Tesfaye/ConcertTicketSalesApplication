package ITEC6309042.com.ConcertTicketSalesApplication.service.payment;

import ITEC6309042.com.ConcertTicketSalesApplication.dto.PaymentDto;
import ITEC6309042.com.ConcertTicketSalesApplication.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private PaymentProcessor paymentProcessor;

    @Override
    public void processPayment(PaymentDto paymentDto) {
        // Implementation
    }

    @Override
    public boolean processPayment(double amount, String stripePaymentId) {
        return false;
    }

    @Override
    public boolean confirmPayment(String paymentId) {
        // Implementation
        return false;
    }
}