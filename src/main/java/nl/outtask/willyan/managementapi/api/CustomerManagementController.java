package nl.outtask.willyan.managementapi.api;

import lombok.extern.slf4j.Slf4j;
import nl.outtask.willyan.managementapi.domain.dto.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/customer")
@Slf4j
public class CustomerManagementController {

    private Customer customer;

    @PostMapping
    private ResponseEntity<Void> createCustomer(@RequestBody final Customer customer) {
      log.info("Customer is {}", customer.toString());
      this.customer = customer;
      return ResponseEntity.created(URI.create("/customer/1")).build();
    }

    @GetMapping("/1")
    private ResponseEntity<Customer> findCustomer() {
        if (null != customer) {
            return ResponseEntity.ok(customer);
        }
        return ResponseEntity.notFound().build();
    }
}
