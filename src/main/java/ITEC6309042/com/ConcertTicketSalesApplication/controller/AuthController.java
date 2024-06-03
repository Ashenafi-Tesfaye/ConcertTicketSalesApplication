package ITEC6309042.com.ConcertTicketSalesApplication.controller;

import ITEC6309042.com.ConcertTicketSalesApplication.dto.AuthRequestDto;
import ITEC6309042.com.ConcertTicketSalesApplication.dto.CustomerDto;
import ITEC6309042.com.ConcertTicketSalesApplication.model.Customer;
import ITEC6309042.com.ConcertTicketSalesApplication.service.concertTicketManagementService.ConcertTicketManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private ConcertTicketManagementService concertTicketManagementService;

    @PostMapping("/signup")
    public Customer signup(@RequestBody CustomerDto customerDto) {
        return concertTicketManagementService.signup(customerDto);
    }

    @PostMapping("/login")
    public Customer login(@RequestBody AuthRequestDto authRequestDto) {
       // return concertTicketManagementService.login(authRequestDto.getUsername(), authRequestDto.getPassword());
        return null;
    }
}