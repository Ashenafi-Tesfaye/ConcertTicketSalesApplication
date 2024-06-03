package ITEC6309042.com.ConcertTicketSalesApplication.util.auth;

import jakarta.servlet.http.HttpServletRequest;

public interface AuthClient {
    boolean authenticate(String token, HttpServletRequest request);
}