package ITEC6309042.com.ConcertTicketSalesApplication.repository;

import ITEC6309042.com.ConcertTicketSalesApplication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}