package com.bs.fizdata.repository.rest.impl;

import com.bs.fizdata.entity.Ticket;
import com.bs.fizdata.repository.rest.TicketRepository;
import com.mongodb.lang.NonNull;

import java.util.List;

public class TicketRepositoryImpl implements TicketRepository {
    public List<Ticket> findTicketsByUserId(@NonNull String id){

    }
}
