package com.java.retailer.reward.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.retailer.reward.model.Customer;

/**
 * 
 * @author chaturanand yadav
 * @since 2022-12-21
 * This is a repository of {@link CustomerRepository}
 *
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
