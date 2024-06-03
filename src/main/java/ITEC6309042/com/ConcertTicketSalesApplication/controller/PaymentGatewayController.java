package ITEC6309042.com.ConcertTicketSalesApplication.controller;

import ITEC6309042.com.ConcertTicketSalesApplication.dto.PaymentGatewayDto;
import ITEC6309042.com.ConcertTicketSalesApplication.model.PaymentGateway;
import ITEC6309042.com.ConcertTicketSalesApplication.service.payment.PaymentGatewayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payment-gateways")
public class PaymentGatewayController {
    @Autowired
    private PaymentGatewayService paymentGatewayService;

    @PostMapping
    public ResponseEntity<PaymentGateway> createPaymentGateway(@RequestBody PaymentGatewayDto paymentGatewayDto) {
        PaymentGateway createdPaymentGateway = paymentGatewayService.createPaymentGateway(paymentGatewayDto);
        return ResponseEntity.ok(createdPaymentGateway);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PaymentGateway> updatePaymentGateway(@PathVariable Long id,
                                                               @RequestBody PaymentGatewayDto paymentGatewayDto) {
        PaymentGateway updatedPaymentGateway = paymentGatewayService.updatePaymentGateway(id, paymentGatewayDto);
        return ResponseEntity.ok(updatedPaymentGateway);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePaymentGateway(@PathVariable Long id) {
        paymentGatewayService.deletePaymentGateway(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PaymentGateway> getPaymentGatewayById(@PathVariable Long id) {
        PaymentGateway paymentGateway = paymentGatewayService.getPaymentGatewayById(id);
        return ResponseEntity.ok(paymentGateway);
    }

    @GetMapping
    public ResponseEntity<List<PaymentGateway>> getAllPaymentGateways() {
        List<PaymentGateway> paymentGateways = paymentGatewayService.getAllPaymentGateways();
        return ResponseEntity.ok(paymentGateways);
    }
}

