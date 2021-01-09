package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID uuid) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Jesse").build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customer) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customer) {
        log.info("updating");
    }

    @Override
    public void deleteById(UUID customerId) {
        log.info("deleting");
    }
}
