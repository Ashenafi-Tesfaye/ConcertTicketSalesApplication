package ITEC6309042.com.ConcertTicketSalesApplication.model;


import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Getter
@Setter
@Entity
public class Concert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String artist;
    private String venue;
    private Date date;
    private String time;
    private String description;
    private double ticketPrice;
    private int availableTickets;
    private String imageUrl; // URL of the concert image stored in Google Cloud Storage
    
   // add Account account;
    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;
    
    @OneToMany(mappedBy = "concert")
    private List<Notification> notifications;
    // Getters and setters
    
//	public Concert() {
//
//	}
//	
//	public Concert(Long id, String artist, String venue, Date date, String time, String description, double ticketPrice,
//			int availableTickets, String imageUrl, Account account) {
//		super();
//		this.id = id;
//		this.artist = artist;
//		this.venue = venue;
//		this.date = date;
//		this.time = time;
//		this.description = description;
//		this.ticketPrice = ticketPrice;
//		this.availableTickets = availableTickets;
//		this.imageUrl = imageUrl;
//		this.account = account;
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
//	public String getArtist() {
//		return artist;
//	}
//
//	public void setArtist(String artist) {
//		this.artist = artist;
//	}
//
//	public String getVenue() {
//		return venue;
//	}
//
//	public void setVenue(String venue) {
//		this.venue = venue;
//	}
//
//	public Date getDate() {
//		return date;
//	}
//
//	public void setDate(Date date) {
//		this.date = date;
//	}
//
//	public String getTime() {
//		return time;
//	}
//
//	public void setTime(String time) {
//		this.time = time;
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
//	public double getTicketPrice() {
//		return ticketPrice;
//	}
//
//	public void setTicketPrice(double ticketPrice) {
//		this.ticketPrice = ticketPrice;
//	}
//
//	public int getAvailableTickets() {
//		return availableTickets;
//	}
//
//	public void setAvailableTickets(int availableTickets) {
//		this.availableTickets = availableTickets;
//	}
//
//	public String getImageUrl() {
//		return imageUrl;
//	}
//
//	public void setImageUrl(String imageUrl) {
//		this.imageUrl = imageUrl;
//	}
//
//	public Account getAccount() {
//		return account;
//	}
//
//	public void setAccount(Account account) {
//		this.account = account;
//	}
	
}