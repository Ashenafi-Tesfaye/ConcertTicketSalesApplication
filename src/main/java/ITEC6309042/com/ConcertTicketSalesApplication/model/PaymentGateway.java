package ITEC6309042.com.ConcertTicketSalesApplication.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class PaymentGateway {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String type; // e.g., Stripe, PayPal
    private String apiKey; // API key for authentication with the payment gateway
    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;
    // Constructors, getters, and setters
    
//        public PaymentGateway() {
//        	
//        }
//        
//		public PaymentGateway(Long id, String name, String type, String apiKey, Account account) {
//			super();
//			this.id = id;
//			this.name = name;
//			this.type = type;
//			this.apiKey = apiKey;
//			this.account = account;
//		}
//
//		public Long getId() {
//			return id;
//		}
//
//		public void setId(Long id) {
//			this.id = id;
//		}
//
//		public String getName() {
//			return name;
//		}
//
//		public void setName(String name) {
//			this.name = name;
//		}
//
//		public String getType() {
//			return type;
//		}
//
//		public void setType(String type) {
//			this.type = type;
//		}
//
//		public String getApiKey() {
//			return apiKey;
//		}
//
//		public void setApiKey(String apiKey) {
//			this.apiKey = apiKey;
//		}
//		
//		public Account getAccount() {
//			return account;
//		}
//		
//		public void setAccount(Account account) {
//			this.account = account;
//		}
//		
//		
}