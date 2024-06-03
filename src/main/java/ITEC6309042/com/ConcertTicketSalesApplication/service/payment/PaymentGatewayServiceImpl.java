package ITEC6309042.com.ConcertTicketSalesApplication.service.payment;

import ITEC6309042.com.ConcertTicketSalesApplication.dto.PaymentGatewayDto;
import ITEC6309042.com.ConcertTicketSalesApplication.model.PaymentGateway;
import ITEC6309042.com.ConcertTicketSalesApplication.repository.PaymentGatewayRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentGatewayServiceImpl implements PaymentGatewayService {
    @Autowired
    private PaymentGatewayRepository paymentGatewayRepository;

    @Override
    public PaymentGateway createPaymentGateway(PaymentGatewayDto paymentGatewayDto) {
        PaymentGateway paymentGateway = new PaymentGateway();
        // Set properties from DTO
        paymentGateway.setName(paymentGatewayDto.getName());
        paymentGateway.setType(paymentGatewayDto.getType());
        paymentGateway.setApiKey(paymentGatewayDto.getApiKey());
        return paymentGatewayRepository.save(paymentGateway);
    }

    @Override
    public PaymentGateway updatePaymentGateway(Long id, PaymentGatewayDto paymentGatewayDto) {
        Optional<PaymentGateway> optionalPaymentGateway = paymentGatewayRepository.findById(id);
        if (optionalPaymentGateway.isPresent()) {
            PaymentGateway paymentGateway = optionalPaymentGateway.get();
            // Update properties from DTO
            paymentGateway.setName(paymentGatewayDto.getName());
            paymentGateway.setType(paymentGatewayDto.getType());
            paymentGateway.setApiKey(paymentGatewayDto.getApiKey());
            return paymentGatewayRepository.save(paymentGateway);
        }
        throw new EntityNotFoundException("PaymentGateway with id " + id + " not found");
    }

    @Override
    public void deletePaymentGateway(Long id) {
        if (paymentGatewayRepository.existsById(id)) {
            paymentGatewayRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("PaymentGateway with id " + id + " not found");
        }
    }

    @Override
    public PaymentGateway getPaymentGatewayById(Long id) {
        return paymentGatewayRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("PaymentGateway with id " + id + " not found"));
    }

    @Override
    public List<PaymentGateway> getAllPaymentGateways() {
        return paymentGatewayRepository.findAll();
    }
}