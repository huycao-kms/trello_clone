package com.demo.trello_clone.repository;

import com.demo.trello_clone.entity.CheckList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckListRepository extends JpaRepository<CheckList, Integer> {
}
