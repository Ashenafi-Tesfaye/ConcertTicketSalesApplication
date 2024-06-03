package ITEC6309042.com.ConcertTicketSalesApplication.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String email;
    private String name;
   
    @Enumerated(EnumType.STRING)
    private UserRole role; // USER, ACCOUNT_ADMIN, SYSTEM_ADMIN
    
//    @OneToMany(mappedBy = "user")
//    private List<Notification> notifications;
    
//    @OneToMany(mappedBy = "user")
//    private List<Recipient> recipients;
    
    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;
    
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    

    // Constructors
//        public User() {
//        	
//        }
//
//
//	public User(Long id, String username, String password, String email, String name, UserRole role, Account account,
//			Customer customer) {
//		super();
//		this.id = id;
//		this.username = username;
//		this.password = password;
//		this.email = email;
//		this.name = name;
//		this.role = role;
//		this.account = account;
//		this.customer = customer;
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
//	public String getUsername() {
//		return username;
//	}
//
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//
//	public String getPassword() {
//		return password;
//	}
//
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//
//	public String getEmail() {
//		return email;
//	}
//
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//
//	public String getName() {
//		return name;
//	}
//
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//
//	public UserRole getRole() {
//		return role;
//	}
//
//
//	public void setRole(UserRole role) {
//		this.role = role;
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
    // Getters and setters
	
	
}