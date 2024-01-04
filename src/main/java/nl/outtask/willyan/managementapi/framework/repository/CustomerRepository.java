package nl.outtask.willyan.managementapi.framework.repository;

import nl.outtask.willyan.managementapi.domain.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
