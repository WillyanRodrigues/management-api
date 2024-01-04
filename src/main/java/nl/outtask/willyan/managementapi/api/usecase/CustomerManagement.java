package nl.outtask.willyan.managementapi.api.usecase;

import nl.outtask.willyan.managementapi.domain.dto.Customer;

import java.util.Optional;

public interface CustomerManagement {

    Customer createCustomer(final Customer customer);

    Optional<Customer> retrieveCustomer(final Integer id);

}
