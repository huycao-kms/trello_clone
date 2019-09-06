package com.demo.trello_clone.service;

import com.demo.trello_clone.entity.Board;

import java.util.List;
import java.util.Optional;

public interface BoardService {
    List<Board> findAll();
    Board findById(int id);
}
