package ITEC6309042.com.ConcertTicketSalesApplication.service.customerService;

import ITEC6309042.com.ConcertTicketSalesApplication.dto.CustomerDto;
import ITEC6309042.com.ConcertTicketSalesApplication.model.Customer;
import ITEC6309042.com.ConcertTicketSalesApplication.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    // Inject dependencies
    @Autowired
    private CustomerRepository customerRepository;


	@Override
	public Customer signup(CustomerDto customerDto) {
		// TODO Auto-generated method stub
		return null;
	}
}