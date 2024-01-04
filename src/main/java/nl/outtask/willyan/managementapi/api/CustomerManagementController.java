package nl.outtask.willyan.managementapi.api;

import lombok.extern.slf4j.Slf4j;
import nl.outtask.willyan.managementapi.domain.dto.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/customer")
@Slf4j
public class CustomerManagementController {

    @PostMapping
    private ResponseEntity<Void> createCustomer(@RequestBody final Customer customer) {
      log.info("Customer is {}", customer.toString());
      return ResponseEntity.created(URI.create("/customer/1")).build();
    }

}
