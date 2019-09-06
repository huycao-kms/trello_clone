package com.demo.trello_clone.repository;

import com.demo.trello_clone.entity.CheckListItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckListItemRepository extends JpaRepository<CheckListItem, Integer> {
}
