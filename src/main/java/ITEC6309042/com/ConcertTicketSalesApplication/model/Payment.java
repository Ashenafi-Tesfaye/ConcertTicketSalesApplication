package ITEC6309042.com.ConcertTicketSalesApplication.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private double amount;
    private LocalDateTime timestamp;
    
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    
    @ManyToOne
    @JoinColumn(name = "payment_gateway_id")
    private PaymentGateway paymentGateway; // Relationship with PaymentGateway
    
    
    private PaymentStatus paymentStatus;  // Moved paymentStatus here

    // Constructors, getters, and setters
    
//	public Payment() {
//
//	}
//	
//	public Payment(Long id, User user, double amount, LocalDateTime timestamp, Customer customer,
//			PaymentGateway paymentGateway, PaymentStatus paymentStatus) {
//		super();
//		this.id = id;
//		this.user = user;
//		this.amount = amount;
//		this.timestamp = timestamp;
//		this.customer = customer;
//		this.paymentGateway = paymentGateway;
//		this.paymentStatus = paymentStatus;
//	}
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}
//
//	public double getAmount() {
//		return amount;
//	}
//
//	public void setAmount(double amount) {
//		this.amount = amount;
//	}
//
//	public LocalDateTime getTimestamp() {
//		return timestamp;
//	}
//
//	public void setTimestamp(LocalDateTime timestamp) {
//		this.timestamp = timestamp;
//	}
//
//	public Customer getCustomer() {
//		return customer;
//	}
//
//	public void setCustomer(Customer customer) {
//		this.customer = customer;
//	}
//
//	public PaymentGateway getPaymentGateway() {
//		return paymentGateway;
//	}
//
//	public void setPaymentGateway(PaymentGateway paymentGateway) {
//		this.paymentGateway = paymentGateway;
//	}
//
//	public PaymentStatus getPaymentStatus() {
//		return paymentStatus;
//	}
//
//	public void setPaymentStatus(PaymentStatus paymentStatus) {
//		this.paymentStatus = paymentStatus;
//	}
//	
	
    // Getters and setters
}
