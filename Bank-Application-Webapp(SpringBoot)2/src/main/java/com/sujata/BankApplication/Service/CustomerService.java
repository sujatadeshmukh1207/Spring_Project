package com.sujata.BankApplication.Service;

import java.util.List;


import org.springframework.data.domain.Page;

import com.sujata.BankApplication.Model.Customer;

public interface CustomerService 
{
	List<Customer> getAllCustomers();
	
	void saveCustomer(Customer customer);
	
	Customer getCustomerById(long id);
	
	void deleteCustomerById(long id);
	
	Page<Customer> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
