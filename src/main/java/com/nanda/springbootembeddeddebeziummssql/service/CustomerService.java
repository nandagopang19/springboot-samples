/*
package com.nanda.springbootembeddeddebeziummssql.service;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.nanda.springbootembeddeddebeziummssql.entity.Customers;
import io.debezium.data.Envelope.Operation;
import org.springframework.stereotype.Service;
import com.nanda.springbootembeddeddebeziummssql.repository.CustomerRepository;

import java.util.Map;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void replicateData(Map<String, Object> customerData, Operation operation) {
        final ObjectMapper mapper = new ObjectMapper();
        final Customers customers = mapper.convertValue(customerData, Customers.class);

        if (Operation.DELETE == operation) {
            customerRepository.deleteById(customers.getId());
        } else {
            customerRepository.save(customers);
        }
    }
}
*/
