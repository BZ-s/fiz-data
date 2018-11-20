package com.bs.fizdata.repository.rest;

import com.bs.fizdata.entity.Ticket;
import com.mongodb.lang.NonNull;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


@RepositoryRestResource(collectionResourceRel = "ticket",path = "ticket")
public interface TicketRepository extends MongoRepository<Ticket,String> {

    public List<Ticket> findTicketsByUserId(@NonNull String id);
}
