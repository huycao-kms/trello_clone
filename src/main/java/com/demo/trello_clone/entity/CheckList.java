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
@Table(name = "checklists")
public class CheckList {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "card_id")
    @JsonIgnore
    private Card card;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "checkList", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<CheckListItem> checkListItems;
}
