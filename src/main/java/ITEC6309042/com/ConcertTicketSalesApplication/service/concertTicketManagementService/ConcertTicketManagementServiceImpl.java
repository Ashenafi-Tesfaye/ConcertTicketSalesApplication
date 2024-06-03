package ITEC6309042.com.ConcertTicketSalesApplication.service.concertTicketManagementService;

import ITEC6309042.com.ConcertTicketSalesApplication.dto.*;
import ITEC6309042.com.ConcertTicketSalesApplication.model.*;
import ITEC6309042.com.ConcertTicketSalesApplication.service.concert.ConcertService;
import ITEC6309042.com.ConcertTicketSalesApplication.service.customerService.CustomerService;
import ITEC6309042.com.ConcertTicketSalesApplication.service.notification.NotificationService;
import ITEC6309042.com.ConcertTicketSalesApplication.service.payment.PaymentGatewayService;
import ITEC6309042.com.ConcertTicketSalesApplication.service.payment.PaymentService;
import ITEC6309042.com.ConcertTicketSalesApplication.service.ticket.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConcertTicketManagementServiceImpl implements ConcertTicketManagementService{
    @Autowired
    private CustomerService customerService;

    @Autowired
    private ConcertService concertService;

    @Autowired
    private TicketService ticketService;

    @Autowired
    private PaymentService paymentService;

    @Autowired
    private NotificationService notificationService;
    
    // Inject PaymentGatewayService for managing payment gateways
    @Autowired
    private PaymentGatewayService paymentGatewayService;
    

    public Customer signup(CustomerDto customerDto) {
        return customerService.signup(customerDto);
    }

    public Concert addConcert(ConcertDto concertDto) {
        return concertService.addConcert(concertDto);
    }

    public Concert updateConcert(ConcertDto concertDto) {
        return concertService.updateConcert(concertDto);
    }

    public void deleteConcert(String concertId) {
        concertService.deleteConcert(concertId);
    }

    public List<Ticket> purchaseTicket(String customerId, String concertId, List<RecipientDto> recipients) {
        return ticketService.purchaseTicket(customerId, concertId, recipients);
    }

    public void processPayment(PaymentDto paymentDto) {
        paymentService.processPayment(paymentDto);
    }

    public boolean confirmPayment(String paymentId) {
        return paymentService.confirmPayment(paymentId);
    }

    public void sendNotification(String recipient, String subject, String content) {
        notificationService.sendNotification(recipient, subject, content);
    }

    public Notification createNotification(NotificationDto notificationDto) {
        return notificationService.createNotification(notificationDto);
    }
    
    public PaymentGateway createPaymentGateway(PaymentGatewayDto paymentGatewayDto) {
        return paymentGatewayService.createPaymentGateway(paymentGatewayDto);
    }

    public PaymentGateway updatePaymentGateway(Long id, PaymentGatewayDto paymentGatewayDto) {
        return paymentGatewayService.updatePaymentGateway(id, paymentGatewayDto);
    }

    public void deletePaymentGateway(Long id) {
        paymentGatewayService.deletePaymentGateway(id);
    }

    public PaymentGateway getPaymentGatewayById(Long id) {
        return paymentGatewayService.getPaymentGatewayById(id);
    }

    public List<PaymentGateway> getAllPaymentGateways() {
        return paymentGatewayService.getAllPaymentGateways();
    }
}
