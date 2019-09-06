package com.demo.trello_clone.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "lists")
public class List {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "board_id")
    @JsonIgnore
    private Board board;

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "list", cascade = CascadeType.ALL)
    private Set<Card> cards;
}
