package com.pma.vueback.repository;

import com.pma.vueback.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByAge(int age);
}
