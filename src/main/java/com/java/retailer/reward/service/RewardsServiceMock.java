package com.java.retailer.reward.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.java.retailer.reward.model.Customer;
import com.java.retailer.reward.model.MyTransaction;

/**
 * 
 * @author chaturanand yadav
 * @since 2022-12-21
 * This is a service  of {@link RewardsServiceMock}
 *
 */
@Service
public class RewardsServiceMock {

	private static List<MyTransaction> transactions = new ArrayList<MyTransaction>();
	private static long index;
	
	static {
		
		transactions.add( new MyTransaction(index++, new Customer(1, "Marco"), 100.0, "Purchase 1", new Date()) );
		transactions.add( new MyTransaction(index++, new Customer(2, "Luis"), 50.0, "Purchase 2", new Date()) );
		transactions.add( new MyTransaction(index++, new Customer(3, "Karla"), 120.0, "Purchase 3", new Date()) );
	
	}
	
	
	public List<MyTransaction> getAll() {
		return transactions;
	}
	
}
