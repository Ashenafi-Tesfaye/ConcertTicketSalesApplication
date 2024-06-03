package ITEC6309042.com.ConcertTicketSalesApplication.controller;

import ITEC6309042.com.ConcertTicketSalesApplication.dto.ConcertDto;
import ITEC6309042.com.ConcertTicketSalesApplication.model.Concert;
import ITEC6309042.com.ConcertTicketSalesApplication.service.concertTicketManagementService.ConcertTicketManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/concerts")
public class ConcertController {
	 @Autowired
	 private ConcertTicketManagementService managerService;

    @PostMapping
    public Concert addConcert(@RequestBody ConcertDto concertDto) {
        return managerService.addConcert(concertDto);
    }

    @PutMapping
    public Concert updateConcert(@RequestBody ConcertDto concertDto) {
        return managerService.updateConcert(concertDto);
    }

    @DeleteMapping("/{id}")
    public void deleteConcert(@PathVariable String id) {
        managerService.deleteConcert(id);
    }
}