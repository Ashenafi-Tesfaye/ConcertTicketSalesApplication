package ITEC6309042.com.ConcertTicketSalesApplication.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "concert_id")
    private Concert concert;
    
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    private int quantity;
    private String barcode;

    @OneToMany(mappedBy = "ticket")
    private List<Recipient> recipients;


    // Constructors
//	public Ticket() {
//
//	}
//
//
//	public Ticket(Long id, User user, Concert concert, Customer customer, int quantity, String barcode,
//			List<Recipient> recipients) {
//		super();
//		this.id = id;
//		this.user = user;
//		this.concert = concert;
//		this.customer = customer;
//		this.quantity = quantity;
//		this.barcode = barcode;
//		this.recipients = recipients;
//	}
//
//
//	public Long getId() {
//		return id;
//	}
//
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//
//	public User getUser() {
//		return user;
//	}
//
//
//	public void setUser(User user) {
//		this.user = user;
//	}
//
//
//	public Concert getConcert() {
//		return concert;
//	}
//
//
//	public void setConcert(Concert concert) {
//		this.concert = concert;
//	}
//
//
//	public Customer getCustomer() {
//		return customer;
//	}
//
//
//	public void setCustomer(Customer customer) {
//		this.customer = customer;
//	}
//
//
//	public int getQuantity() {
//		return quantity;
//	}
//
//
//	public void setQuantity(int quantity) {
//		this.quantity = quantity;
//	}
//
//
//	public String getBarcode() {
//		return barcode;
//	}
//
//
//	public void setBarcode(String barcode) {
//		this.barcode = barcode;
//	}
//
//
//	public List<Recipient> getRecipients() {
//		return recipients;
//	}
//
//
//	public void setRecipients(List<Recipient> recipients) {
//		this.recipients = recipients;
//	}
//	
	
	
    // Getters and setters
	
	
}