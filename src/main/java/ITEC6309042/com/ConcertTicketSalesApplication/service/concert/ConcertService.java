package ITEC6309042.com.ConcertTicketSalesApplication.service.concert;

import ITEC6309042.com.ConcertTicketSalesApplication.dto.ConcertDto;
import ITEC6309042.com.ConcertTicketSalesApplication.model.Concert;

public interface ConcertService {
    Concert addConcert(ConcertDto concertDto);
    Concert updateConcert(ConcertDto concertDto);
    void deleteConcert(String concertId);
}