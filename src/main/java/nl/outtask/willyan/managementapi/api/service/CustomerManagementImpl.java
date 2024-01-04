package nl.outtask.willyan.managementapi.api.service;

import jakarta.websocket.server.ServerEndpoint;
import nl.outtask.willyan.managementapi.api.usecase.CustomerManagement;
import nl.outtask.willyan.managementapi.domain.dto.Customer;
import nl.outtask.willyan.managementapi.domain.model.mapper.CustomerMapper;
import nl.outtask.willyan.managementapi.framework.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerManagementImpl implements CustomerManagement {

    @Autowired
    private CustomerRepository repository;

    @Override
    public Customer createCustomer(final Customer customer) {
        final var customerEntity = this.repository.save(CustomerMapper.mapModel(customer));
        return CustomerMapper.mapDto(customerEntity);
    }

    @Override
    public Optional<Customer> retrieveCustomer(final Integer id) {
        return this.repository.findById(id)
                .map(CustomerMapper::mapDto);
    }
}
