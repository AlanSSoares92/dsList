package com.devsupdslist.dslist.controller;

import com.devsupdslist.dslist.DTO.GameDTO;
import com.devsupdslist.dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/game")
@RestController
public class GameController {

    @Autowired private GameService service;

    @GetMapping
    public List<GameDTO> getAll(){
       return service.findAll();
    }

}