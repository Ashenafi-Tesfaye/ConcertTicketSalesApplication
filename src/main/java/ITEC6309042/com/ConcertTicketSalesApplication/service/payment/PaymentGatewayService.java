package ITEC6309042.com.ConcertTicketSalesApplication.service.payment;

import ITEC6309042.com.ConcertTicketSalesApplication.dto.PaymentGatewayDto;
import ITEC6309042.com.ConcertTicketSalesApplication.model.PaymentGateway;

import java.util.List;

public interface PaymentGatewayService {
    PaymentGateway createPaymentGateway(PaymentGatewayDto paymentGatewayDto);
    PaymentGateway updatePaymentGateway(Long id, PaymentGatewayDto paymentGatewayDto);
    void deletePaymentGateway(Long id);
    PaymentGateway getPaymentGatewayById(Long id);
    List<PaymentGateway> getAllPaymentGateways();
}