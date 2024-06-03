package ITEC6309042.com.ConcertTicketSalesApplication.service.customerService;

import ITEC6309042.com.ConcertTicketSalesApplication.dto.CustomerDto;
import ITEC6309042.com.ConcertTicketSalesApplication.model.Customer;

public interface CustomerService {
    Customer signup(CustomerDto customerDto);
}