package ITEC6309042.com.ConcertTicketSalesApplication.service.user;

import ITEC6309042.com.ConcertTicketSalesApplication.dto.UserDto;
import ITEC6309042.com.ConcertTicketSalesApplication.model.Account;
import ITEC6309042.com.ConcertTicketSalesApplication.model.User;
import ITEC6309042.com.ConcertTicketSalesApplication.model.UserRole;
import ITEC6309042.com.ConcertTicketSalesApplication.repository.AccountRepository;
import ITEC6309042.com.ConcertTicketSalesApplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public User createUser(UserDto userDto, String role) {
        // Check if the user is authorized to create this user
        // This check should ensure that only COMPANY_ADMIN can create ACCOUNT_ADMIN and USER
        // and ACCOUNT_ADMIN can only create USER within their account
        User user = new User();
        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword()); // Encrypt the password
        user.setEmail(userDto.getEmail());
        user.setName(userDto.getName());
        user.setRole(UserRole.valueOf(role));

        // Set account if role is ACCOUNT_ADMIN or USER
        if (role.equals("ACCOUNT_ADMIN") || role.equals("USER")) {
            Account account = accountRepository.findById(userDto.getAccountId())
                    .orElseThrow(() -> new RuntimeException("Account not found"));
            user.setAccount(account);
        }

        return userRepository.save(user);
    }

    @Override
    public User createAdmin(UserDto userDto) {
        // Only COMPANY_ADMIN can create other COMPANY_ADMIN users
        return createUser(userDto, "COMPANY_ADMIN");
    }

	@Override
	public User signup(UserDto userDto) {
		// TODO Auto-generated method stub
		return null;
	}
}