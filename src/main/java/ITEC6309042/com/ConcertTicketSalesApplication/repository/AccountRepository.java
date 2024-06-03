package ITEC6309042.com.ConcertTicketSalesApplication.repository;

import ITEC6309042.com.ConcertTicketSalesApplication.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;




public interface AccountRepository extends JpaRepository<Account, Long>{
}
