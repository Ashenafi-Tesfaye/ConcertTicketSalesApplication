package ITEC6309042.com.ConcertTicketSalesApplication.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String recipient;
    private String subject;
    private String content;
    private NotificationStatus status;


    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "concert_id")
    private Concert concert;
    
//	public Notification() {
//	}
//
//	public Notification(Long id, String recipient, String subject, String content, NotificationStatus status,
//			Customer customer, Concert concert, Ticket ticket) {
//		super();
//		this.id = id;
//		this.recipient = recipient;
//		this.subject = subject;
//		this.content = content;
//		this.status = status;
//		this.customer = customer;
//		this.concert = concert;
//		this.ticket = ticket;
//	}
//	
//	public Ticket getTicket() {
//		return ticket;
//	}
//	
//	public void setTicket(Ticket ticket) {
//		this.ticket = ticket;
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
//	public String getRecipient() {
//		return recipient;
//	}
//
//	public void setRecipient(String recipient) {
//		this.recipient = recipient;
//	}
//
//	public String getSubject() {
//		return subject;
//	}
//
//	public void setSubject(String subject) {
//		this.subject = subject;
//	}
//
//	public String getContent() {
//		return content;
//	}
//
//	public void setContent(String content) {
//		this.content = content;
//	}
//
//	public NotificationStatus getStatus() {
//		return status;
//	}
//
//	public void setStatus(NotificationStatus status) {
//		this.status = status;
//	}
//
//
//	public Concert getConcert() {
//		return concert;
//	}
//
//	public void setConcert(Concert concert) {
//		this.concert = concert;
//	}
//	
//	public Customer getCustomer() {
//		return customer;
//    }
//	
//	public void setCustomer(Customer customer) {
//		this.customer = customer;
//		
//	}
//	

    // Getters and setters
	
	
}