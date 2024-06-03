package ITEC6309042.com.ConcertTicketSalesApplication.controller;

import ITEC6309042.com.ConcertTicketSalesApplication.dto.UserDto;
import ITEC6309042.com.ConcertTicketSalesApplication.model.User;
import ITEC6309042.com.ConcertTicketSalesApplication.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;
	
    @PostMapping("/create")
 //   @PreAuthorize("hasRole('SYSTEM_ADMIN') or (hasRole('ACCOUNT_ADMIN') and #userDto.role == 'USER')")
    public ResponseEntity<User> createUser(@RequestBody UserDto userDto, @RequestParam String role) {
        User user = userService.createUser(userDto, role);
        return ResponseEntity.ok(user);
    }

    @PostMapping("/create-admin")
  //  @PreAuthorize("hasRole('SYSTEM_ADMIN')")
    public ResponseEntity<User> createAdmin(@RequestBody UserDto userDto) {
        User admin = userService.createAdmin(userDto);
        return ResponseEntity.ok(admin);
    }
}
