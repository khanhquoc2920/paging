package com.phucle.spring.jpa.service.define;

import org.springframework.data.domain.Pageable;

import org.springframework.data.domain.Page;

import com.phucle.spring.jpa.entity.Customer;
import com.phucle.spring.jpa.entity.Province;

public interface CustomerPageService {
	
    Page<Customer> findAll(Pageable pageable);

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);

    Iterable<Customer> findAllByProvince(Province province);

    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);
}

