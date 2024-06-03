package ITEC6309042.com.ConcertTicketSalesApplication.repository;

import ITEC6309042.com.ConcertTicketSalesApplication.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CustomerRepository extends JpaRepository<Customer, Long>{
	

}
