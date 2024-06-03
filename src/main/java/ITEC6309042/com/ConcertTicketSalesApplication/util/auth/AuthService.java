package ITEC6309042.com.ConcertTicketSalesApplication.util.auth;

import ITEC6309042.com.ConcertTicketSalesApplication.dto.AuthRequestDto;
import ITEC6309042.com.ConcertTicketSalesApplication.dto.AuthResponseDto;
import ITEC6309042.com.ConcertTicketSalesApplication.dto.UserDto;
import ITEC6309042.com.ConcertTicketSalesApplication.repository.RoleRepository;
import ITEC6309042.com.ConcertTicketSalesApplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    
//    private final AuthClient authClient;
   
//    @Autowired
//    private PasswordEncoder passwordEncoder;

    public AuthResponseDto login(AuthRequestDto authRequest) {
        // Authentication logic
        // Generate JWT token
        return null;
    }

    public boolean signup(UserDto userDto) {
        // User registration logic
        return true;
    }
}
