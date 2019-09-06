package com.demo.trello_clone.controller;

import com.demo.trello_clone.entity.Board;
import com.demo.trello_clone.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/board")
public class BoardController {

    @Autowired
    BoardRepository boardRepository;

    @GetMapping("/findAll")
    public List<Board> findAll(){
        return boardRepository.findAll();
    }
}
