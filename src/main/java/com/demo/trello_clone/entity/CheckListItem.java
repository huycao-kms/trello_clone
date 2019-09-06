package com.demo.trello_clone.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "checklist_items")
public class CheckListItem {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "checklist_id")
    private CheckList checkList;
}
