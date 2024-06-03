package ITEC6309042.com.ConcertTicketSalesApplication.controller;

import ITEC6309042.com.ConcertTicketSalesApplication.dto.TicketDto;
import ITEC6309042.com.ConcertTicketSalesApplication.model.Ticket;
import ITEC6309042.com.ConcertTicketSalesApplication.service.concertTicketManagementService.ConcertTicketManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {
	 @Autowired
	 private ConcertTicketManagementService managerService;

    @PostMapping("/purchase")
    public List<Ticket> purchaseTicket(@RequestBody TicketDto ticketDto) {
        return managerService.purchaseTicket(ticketDto.getUserId(), ticketDto.getConcertId(), ticketDto.getRecipients());
    }
}
