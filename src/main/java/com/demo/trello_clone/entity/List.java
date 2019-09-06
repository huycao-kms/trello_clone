package com.demo.trello_clone.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "lists")
public class List {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    private String name;

}
