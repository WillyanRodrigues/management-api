package nl.outtask.willyan.managementapi.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Customer {

    private String name;

    @JsonProperty("date_of_birth")
    private String dateOfBirth;

    @JsonProperty("document_number")
    private String documentNumber;

}
