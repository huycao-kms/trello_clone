package com.demo.trello_clone.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "card_member")
public class CardMember {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    @JsonIgnore
    private User user;

    @ManyToOne
    @JoinColumn(name = "card_id")
    @JsonIgnore
    private Card card;
}
