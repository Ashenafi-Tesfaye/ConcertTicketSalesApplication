package ITEC6309042.com.ConcertTicketSalesApplication.controller;

import ITEC6309042.com.ConcertTicketSalesApplication.dto.PaymentDto;
import ITEC6309042.com.ConcertTicketSalesApplication.service.concertTicketManagementService.ConcertTicketManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {
	 @Autowired
	 private ConcertTicketManagementService managerService;

    @PostMapping
    public void processPayment(@RequestBody PaymentDto paymentDto) {
        managerService.processPayment(paymentDto);
    }

    @GetMapping("/confirm/{paymentId}")
    public boolean confirmPayment(@PathVariable String paymentId) {
        return managerService.confirmPayment(paymentId);
    }
}