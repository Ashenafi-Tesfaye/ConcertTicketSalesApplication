package ITEC6309042.com.ConcertTicketSalesApplication.service.concert;

import ITEC6309042.com.ConcertTicketSalesApplication.dto.ConcertDto;
import ITEC6309042.com.ConcertTicketSalesApplication.model.Concert;
import ITEC6309042.com.ConcertTicketSalesApplication.repository.ConcertRepository;
import ITEC6309042.com.ConcertTicketSalesApplication.util.GoogleCloudStorageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConcertServiceImpl implements ConcertService {
    @Autowired
    private ConcertRepository concertRepository;

    @Autowired
    private GoogleCloudStorageUtil googleCloudStorageUtil;

    @Override
    public Concert addConcert(ConcertDto concertDto) {
        // Implementation
        return null;
    }

    @Override
    public Concert updateConcert(ConcertDto concertDto) {
        // Implementation
        return null;
    }

    @Override
    public void deleteConcert(String concertId) {
        // Implementation
    }
}