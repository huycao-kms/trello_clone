package com.demo.trello_clone.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "checklists")
public class CheckList {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "card_id")
    private Card card;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "checkList", cascade = CascadeType.ALL)
    private Set<CheckListItem> checkListItems;
}
