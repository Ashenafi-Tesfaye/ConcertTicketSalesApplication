package ITEC6309042.com.ConcertTicketSalesApplication.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Recipient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    @ManyToOne
    @JoinColumn(name = "ticket_id")
    private Ticket ticket;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    
    // Constructors, getters, and setters
//	public Recipient() {
//
//	}
//
//	public Recipient(Long id, String name, String email, Ticket ticket, Customer customer) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.email = email;
//		this.ticket = ticket;
//		this.customer = customer;
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
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
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
//    public Customer getCustomer() {
//    	        return customer;
//    }
//    
//	public void setCustomer(Customer customer) {
//		this.customer = customer;
//	}
//	
	

    // Getters and setters
	
	
}