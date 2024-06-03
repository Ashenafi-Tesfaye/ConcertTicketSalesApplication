package ITEC6309042.com.ConcertTicketSalesApplication.controller;

import ITEC6309042.com.ConcertTicketSalesApplication.dto.NotificationDto;
import ITEC6309042.com.ConcertTicketSalesApplication.service.concertTicketManagementService.ConcertTicketManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notifications")
public class NotificationController {
	 @Autowired
	 private ConcertTicketManagementService managerService;

    @PostMapping
    public void sendNotification(@RequestBody NotificationDto notificationDto) {
        managerService.sendNotification(notificationDto.getRecipient(), notificationDto.getSubject(), notificationDto.getContent());
    }
}
