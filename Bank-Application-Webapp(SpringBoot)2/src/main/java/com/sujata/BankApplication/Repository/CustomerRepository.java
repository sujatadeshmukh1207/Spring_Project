package com.sujata.BankApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sujata.BankApplication.Model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
