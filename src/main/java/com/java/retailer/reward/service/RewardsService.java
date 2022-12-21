package com.java.retailer.reward.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.retailer.reward.model.Customer;
import com.java.retailer.reward.repository.CustomerRepository;

/**
 * 
 * @author chaturanand yadav
 * @since 2022-12-21
 * This is a service of {@link RewardsService}
 *
 */
@Service
public class RewardsService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	
	public List<Customer> getCustomerAll() {
		return customerRepository.findAll();
	}
	
	public Customer getCustomerById(Integer customerId) {
		return customerRepository.findById(customerId).orElse(null);
	}
	
}
