package ITEC6309042.com.ConcertTicketSalesApplication.service.account;

import ITEC6309042.com.ConcertTicketSalesApplication.model.TicketSalesProgress;

import java.util.List;

public interface AccountConcertReportService {
    void sendConcertUpdate(Long accountId, Long concertId, TicketSalesProgress ticketSalesProgress);
    void sendHistoricalUpdate(Long accountId, Long concertId, List<TicketSalesProgress> historicalProgress);
    TicketSalesProgress getConcertUpdate(Long accountId, Long concertId);
    List<TicketSalesProgress> listAllAccountConcertUpdates(Long accountId);
    List<TicketSalesProgress> listAllConcertUpdates();
}
