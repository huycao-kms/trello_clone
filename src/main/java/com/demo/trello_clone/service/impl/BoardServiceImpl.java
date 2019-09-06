package com.demo.trello_clone.service.impl;

import com.demo.trello_clone.entity.Board;
import com.demo.trello_clone.repository.BoardRepository;
import com.demo.trello_clone.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    BoardRepository boardRepository;

    @Override
    public List<Board> findAll() {
        return boardRepository.findAll();
    }

    @Override
    public Board findById(int id) {
        Optional<Board> board = boardRepository.findById(id);
        return board.get();
    }
}
