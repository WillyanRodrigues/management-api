package nl.outtask.willyan.managementapi.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Customer {

    /**
     * Not mandatory for being sent
     */
    private Integer id;

    private String name;

    @JsonProperty("date_of_birth")
    private String dateOfBirth;

    @JsonProperty("document_number")
    private String documentNumber;

}


