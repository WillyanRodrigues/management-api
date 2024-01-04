package nl.outtask.willyan.managementapi.domain.model.mapper;

import nl.outtask.willyan.managementapi.domain.model.Customer;

import java.time.LocalDate;

public class CustomerMapper {

    public static Customer mapModel(final nl.outtask.willyan.managementapi.domain.dto.Customer customer) {
       return new Customer(customer.getName(), customer.getDateOfBirth(), customer.getDocumentNumber());
    }

    public static nl.outtask.willyan.managementapi.domain.dto.Customer mapDto(Customer customer) {
        nl.outtask.willyan.managementapi.domain.dto.Customer cust = new nl.outtask.willyan.managementapi.domain.dto.Customer();
        cust.setName(customer.getName());
        cust.setDocumentNumber(customer.getDocumentNumber());
        cust.setDateOfBirth(customer.getDateOfBirth());
        cust.setId(customer.getId());

        return cust;
    }

}
