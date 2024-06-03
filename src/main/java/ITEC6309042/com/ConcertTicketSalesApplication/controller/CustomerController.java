package ITEC6309042.com.ConcertTicketSalesApplication.controller;

import ITEC6309042.com.ConcertTicketSalesApplication.dto.CustomerDto;
import ITEC6309042.com.ConcertTicketSalesApplication.model.Customer;
import ITEC6309042.com.ConcertTicketSalesApplication.service.customerService.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable Long id) {
       // return customerService.getCustomer(id);
    	return null;
    }

    @PutMapping("/{id}")
    public Customer updateCustomer(@PathVariable Long id, @RequestBody CustomerDto customerDto) {
       // return customerService.updateCustomer(id, customerDto);
    	return null;
    }
}
