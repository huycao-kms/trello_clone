package com.demo.trello_clone.repository;

import com.demo.trello_clone.entity.BoardMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardMemberRepository extends JpaRepository<BoardMember, Integer> {
}
