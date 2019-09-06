package com.demo.trello_clone.controller;

import com.demo.trello_clone.entity.Board;
import com.demo.trello_clone.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/board")
public class BoardController {

    @Autowired
    BoardService boardService;

    @GetMapping("/findAll")
    public List<Board> findAll(){
        return boardService.findAll();
    }

    @GetMapping("/findById/{id}")
    public Board findById(@PathVariable(name = "id") Integer id){
        return boardService.findById(id);
    }

    @PostMapping("/create")
    public Board create(@RequestBody Board board){
        return null;
    }
}
