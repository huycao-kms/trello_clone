package com.demo.trello_clone.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Board {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int id;

    String name;

}
