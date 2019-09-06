package com.demo.trello_clone.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "card_member")
public class CardMember {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "card_id")
    private Card card;
}
