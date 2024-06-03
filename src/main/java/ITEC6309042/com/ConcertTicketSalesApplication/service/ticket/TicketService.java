package ITEC6309042.com.ConcertTicketSalesApplication.service.ticket;

import ITEC6309042.com.ConcertTicketSalesApplication.dto.RecipientDto;
import ITEC6309042.com.ConcertTicketSalesApplication.model.Ticket;

import java.util.List;

public interface TicketService {
    List<Ticket> purchaseTicket(String customerId, String concertId, List<RecipientDto> recipients);
    boolean verifyBarcode(String barcode);
}