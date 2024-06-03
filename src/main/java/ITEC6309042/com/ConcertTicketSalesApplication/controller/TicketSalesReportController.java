package ITEC6309042.com.ConcertTicketSalesApplication.controller;

import ITEC6309042.com.ConcertTicketSalesApplication.model.TicketSalesProgress;
import ITEC6309042.com.ConcertTicketSalesApplication.service.account.AccountConcertReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/ticket-sales-reports")
public class TicketSalesReportController {
    @Autowired
    private AccountConcertReportService ticketSalesReportService;

    @GetMapping("/{accountId}/concerts/{concertId}")
    public ResponseEntity<TicketSalesProgress> getConcertSalesReport(@PathVariable Long accountId, @PathVariable Long concertId) {
        TicketSalesProgress salesReport = ticketSalesReportService.getConcertUpdate(accountId, concertId);
        return ResponseEntity.ok(salesReport);
    }

    @GetMapping("/{accountId}/concerts/{concertId}/history")
    public ResponseEntity<List<TicketSalesProgress>> getConcertSalesHistory(@PathVariable Long accountId, @PathVariable Long concertId) {
        List<TicketSalesProgress> salesHistory = ticketSalesReportService.listAllAccountConcertUpdates(accountId);
        return ResponseEntity.ok(salesHistory);
    }
    
    @GetMapping
	public ResponseEntity<List<TicketSalesProgress>> getAllConcertSalesHistory() {
		List<TicketSalesProgress> salesHistory = ticketSalesReportService.listAllConcertUpdates();
		return ResponseEntity.ok(salesHistory);
	}
}
