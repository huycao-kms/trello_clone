package com.demo.trello_clone.repository;

import com.demo.trello_clone.entity.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListRepository extends JpaRepository<List, Integer> {
}
