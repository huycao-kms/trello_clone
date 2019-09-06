package com.demo.trello_clone.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "board_member")
public class BoardMember {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "board_id")
    private Board board;
}
