package ITEC6309042.com.ConcertTicketSalesApplication.util.auth;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;


@Service
public class AuthClientImpl implements AuthClient{

	@Override
	public boolean authenticate(String token, HttpServletRequest request) {
		// TODO Auto-generated method stub
		return false;
	}

}
