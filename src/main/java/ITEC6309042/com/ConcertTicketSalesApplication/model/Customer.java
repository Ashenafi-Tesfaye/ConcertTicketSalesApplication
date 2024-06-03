package ITEC6309042.com.ConcertTicketSalesApplication.model;



import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Customer {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "customer")
    private List<User> user;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    @OneToMany(mappedBy = "customer")
    private List<Ticket> tickets;

    @OneToMany(mappedBy = "customer")
    private List<Recipient> recipients;
    
    @ManyToOne
    @JoinColumn(name = "payment_gateway_id")
    private PaymentGateway preferredPaymentGateway;

//	public Customer(Long id, List<User> user, Account account, List<Ticket> tickets,
//			PaymentGateway preferredPaymentGateway) {
//		super();
//		this.id = id;
//		this.user = user;
//		this.account = account;
//		this.tickets = tickets;
//		this.preferredPaymentGateway = preferredPaymentGateway;
//	}
//
//
//    public Customer() {
//    	
//    }
//    // Getters and setters
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
//	public List<User> getUser() {
//		return user;
//	}
//
//
//	public void setUser(List<User> user) {
//		this.user = user;
//	}
//
//
//	public Account getAccount() {
//		return account;
//	}
//
//
//	public void setAccount(Account account) {
//		this.account = account;
//	}
//
//
//	public List<Ticket> getTickets() {
//		return tickets;
//	}
//
//
//	public void setTickets(List<Ticket> tickets) {
//		this.tickets = tickets;
//	}
//
//
//	public PaymentGateway getPreferredPaymentGateway() {
//		return preferredPaymentGateway;
//	}
//
//
//	public void setPreferredPaymentGateway(PaymentGateway preferredPaymentGateway) {
//		this.preferredPaymentGateway = preferredPaymentGateway;
//	}
//    
//    
//    
  
}

