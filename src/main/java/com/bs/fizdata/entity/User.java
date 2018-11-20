package com.bs.fizdata.entity;

import org.springframework.data.annotation.Id;

public class User extends Document{


    public String firstName;
    public String lastName;

    public User(String id) {
        super(id);
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }

}
