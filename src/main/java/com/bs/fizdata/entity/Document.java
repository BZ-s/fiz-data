package com.bs.fizdata.entity;

import org.springframework.data.annotation.Id;

import java.io.Serializable;

public class Document implements Serializable {

    @Id
    String id;

    public Document(String id) {
        this.id = id;
    }
}
