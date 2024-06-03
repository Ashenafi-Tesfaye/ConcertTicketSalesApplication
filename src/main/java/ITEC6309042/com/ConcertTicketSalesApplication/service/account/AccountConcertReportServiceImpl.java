package ITEC6309042.com.ConcertTicketSalesApplication.service.account;

import ITEC6309042.com.ConcertTicketSalesApplication.model.TicketSalesProgress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountConcertReportServiceImpl implements AccountConcertReportService {
    @Autowired
    private AccountService accountService;

    // Other autowired services...


	@Override
	public void sendConcertUpdate(Long accountId, Long concertId, TicketSalesProgress ticketSalesProgress) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendHistoricalUpdate(Long accountId, Long concertId, List<TicketSalesProgress> historicalProgress) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TicketSalesProgress getConcertUpdate(Long accountId, Long concertId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TicketSalesProgress> listAllAccountConcertUpdates(Long accountId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TicketSalesProgress> listAllConcertUpdates() {
		// TODO Auto-generated method stub
		return null;
	}
}
