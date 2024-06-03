package ITEC6309042.com.ConcertTicketSalesApplication.service.concertTicketManagementService;

import ITEC6309042.com.ConcertTicketSalesApplication.dto.*;
import ITEC6309042.com.ConcertTicketSalesApplication.model.*;

import java.util.List;

public interface ConcertTicketManagementService {
    Customer signup(CustomerDto customerDto);
    Concert addConcert(ConcertDto concertDto);
    Concert updateConcert(ConcertDto concertDto);
    void deleteConcert(String concertId);
    List<Ticket> purchaseTicket(String customerId, String concertId, List<RecipientDto> recipients);
    void processPayment(PaymentDto paymentDto);
    boolean confirmPayment(String paymentId);
    void sendNotification(String recipient, String subject, String content);
    Notification createNotification(NotificationDto notificationDto);
    PaymentGateway createPaymentGateway(PaymentGatewayDto paymentGatewayDto);
    PaymentGateway updatePaymentGateway(Long id, PaymentGatewayDto paymentGatewayDto);
    void deletePaymentGateway(Long id);
    PaymentGateway getPaymentGatewayById(Long id);
    List<PaymentGateway> getAllPaymentGateways();
}