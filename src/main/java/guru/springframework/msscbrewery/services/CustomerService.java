package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID uuid);

    CustomerDto saveNewCustomer(CustomerDto customer);

    void updateCustomer(UUID customerId, CustomerDto customer);

    void deleteById(UUID customerId);
}
