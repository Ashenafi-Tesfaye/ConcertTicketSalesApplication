package ITEC6309042.com.ConcertTicketSalesApplication.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    private String username;
    private String password;
    private String email;
    private String name;
    private String role; // USER, ACCOUNT_ADMIN, or ADMIN	
    private String customerId;
    private Long accountId; // Optional for ACCOUNT_ADMIN and USER

    // Getters and setters
}