package ITEC6309042.com.ConcertTicketSalesApplication.repository;

import ITEC6309042.com.ConcertTicketSalesApplication.model.PaymentGateway;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentGatewayRepository extends JpaRepository<PaymentGateway, Long> {
    // Define custom queries if needed
}
