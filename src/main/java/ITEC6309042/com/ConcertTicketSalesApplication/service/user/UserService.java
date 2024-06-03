package ITEC6309042.com.ConcertTicketSalesApplication.service.user;

import ITEC6309042.com.ConcertTicketSalesApplication.dto.UserDto;
import ITEC6309042.com.ConcertTicketSalesApplication.model.User;

public interface UserService {
   
   User createUser(UserDto userDto, String role);
   User createAdmin(UserDto userDto);
   User signup(UserDto userDto);
}
