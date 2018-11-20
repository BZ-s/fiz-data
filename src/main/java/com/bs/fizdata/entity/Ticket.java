package com.bs.fizdata.entity;

public class Ticket extends Document {

    String pathRessource;
    User user;

    public Ticket(String id) {
        super(id);
    }
}
