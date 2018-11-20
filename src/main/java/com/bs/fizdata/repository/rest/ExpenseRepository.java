package com.bs.fizdata.repository.rest;

import com.bs.fizdata.entity.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "expense", path = "expense")
public interface ExpenseRepository extends MongoRepository<Expense,String> {
}
