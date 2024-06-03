package ITEC6309042.com.ConcertTicketSalesApplication.repository;

import ITEC6309042.com.ConcertTicketSalesApplication.model.Concert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConcertRepository extends JpaRepository<Concert, Long> {}
