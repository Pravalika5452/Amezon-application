package com.web.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.model.Customer1;
@Repository
public interface CustRepo extends CrudRepository<Customer1, Integer> {

}
