package com.demo.trello_clone.repository;

import com.demo.trello_clone.entity.CardMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardMemberRepository extends JpaRepository<CardMember, Integer> {
}
