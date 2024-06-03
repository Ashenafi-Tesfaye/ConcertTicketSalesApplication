package ITEC6309042.com.ConcertTicketSalesApplication.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    Long accountId;
    String name;
    String contactEmail;
    String contactPhone;
    String street;
    String city;
    String state;
    String country;
    String zipCode;
    String website;
    String logoUrl;
    String description;
    @OneToMany(mappedBy = "account")
    List<ITEC6309042.com.ConcertTicketSalesApplication.model.User> users;
    
    @OneToMany(mappedBy = "account")
    private List<ITEC6309042.com.ConcertTicketSalesApplication.model.Customer> customers;
    
    @OneToMany(mappedBy = "account")
    private List<ITEC6309042.com.ConcertTicketSalesApplication.model.Concert> concerts;
    
    @OneToMany(mappedBy = "account")
    private List<ITEC6309042.com.ConcertTicketSalesApplication.model.PaymentGateway> paymentGateway;

    // Constructor and methods
    
//	public Account() {
//
//	}
//	
//	public Account(Long accountId, String name, String contactEmail, String contactPhone, String street, String city,
//            String state, String country, String zipCode, String website, String logoUrl, String description,
//            List<User> users, List<Customer> customers, List<Concert> concerts, List<PaymentGateway> paymentGateway) {
//        super();
//        this.accountId = accountId;
//        this.name = name;
//        this.contactEmail = contactEmail;
//        this.contactPhone = contactPhone;
//        this.street = street;
//        this.city = city;
//        this.state = state;
//        this.country = country;
//        this.zipCode = zipCode;
//        this.website = website;
//        this.logoUrl = logoUrl;
//        this.description = description;
//        this.users = users;
//        this.customers = customers;
//        this.concerts = concerts;
//        this.paymentGateway = paymentGateway;
//	}
//
//	public Long getAccountId() {
//		return accountId;
//	}
//
//	public void setAccountId(Long accountId) {
//		this.accountId = accountId;
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
//	public String getContactEmail() {
//		return contactEmail;
//	}
//
//	public void setContactEmail(String contactEmail) {
//		this.contactEmail = contactEmail;
//	}
//
//	public String getContactPhone() {
//		return contactPhone;
//	}
//
//	public void setContactPhone(String contactPhone) {
//		this.contactPhone = contactPhone;
//	}
//
//	public String getStreet() {
//		return street;
//	}
//
//	public void setStreet(String street) {
//		this.street = street;
//	}
//
//	public String getCity() {
//		return city;
//	}
//
//	public void setCity(String city) {
//		this.city = city;
//	}
//
//	public String getState() {
//		return state;
//	}
//
//	public void setState(String state) {
//		this.state = state;
//	}
//
//	public String getCountry() {
//		return country;
//	}
//
//	public void setCountry(String country) {
//		this.country = country;
//	}
//
//	public String getZipCode() {
//		return zipCode;
//	}
//
//	public void setZipCode(String zipCode) {
//		this.zipCode = zipCode;
//	}
//
//	public String getWebsite() {
//		return website;
//	}
//
//	public void setWebsite(String website) {
//		this.website = website;
//	}
//
//	public String getLogoUrl() {
//		return logoUrl;
//	}
//
//	public void setLogoUrl(String logoUrl) {
//		this.logoUrl = logoUrl;
//	}
//
//	public String getDescription() {
//		return description;
//	}
//
//	public void setDescription(String description) {
//		this.description = description;
//	}
//
//	public List<User> getUsers() {
//		return users;
//	}
//
//	public void setUsers(List<User> users) {
//		this.users = users;
//	}
//
//	public List<Customer> getCustomers() {
//		return customers;
//	}
//
//	public void setCustomers(List<Customer> customers) {
//		this.customers = customers;
//	}
//
//	public List<Concert> getConcerts() {
//		return concerts;
//	}
//
//	public void setConcerts(List<Concert> concerts) {
//		this.concerts = concerts;
//	}
//
//	public List<PaymentGateway> getPaymentGateway() {
//		return paymentGateway;
//	}
//	
//	public void setPaymentGateway(List<PaymentGateway> paymentGateway) {
//		this.paymentGateway = paymentGateway;
//	}
//	
//	
}
