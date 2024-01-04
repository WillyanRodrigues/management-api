package nl.outtask.willyan.managementapi.api;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import nl.outtask.willyan.managementapi.api.usecase.CustomerManagement;
import nl.outtask.willyan.managementapi.domain.dto.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/customer")
@Slf4j
public class CustomerManagementController {

    @Autowired
    private CustomerManagement customerManagement;

    @PostMapping
    private ResponseEntity<Void> createCustomer(@RequestBody final Customer customer) {
      log.info("Creating customer {}", customer.toString());
      var cust = this.customerManagement.createCustomer(customer);
      log.info("Customer {} is created", customer.toString());
      return ResponseEntity.created(URI.create(String.format("/customer/%d", cust.getId()))).build();
    }

    @GetMapping("/{id}")
    private ResponseEntity<Customer> findCustomer(final @PathVariable(name = "id") Integer id) {
        log.info("Retrieving customer with ID {}", id);
        var customer = this.customerManagement.retrieveCustomer(id);
        log.info("Customer is {}", customer.orElse(null));
        return customer
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
