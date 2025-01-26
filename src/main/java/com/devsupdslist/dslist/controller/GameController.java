package com.devsupdslist.dslist.controller;

import com.devsupdslist.dslist.DTO.GameDTO;
import com.devsupdslist.dslist.DTO.GameMinDTO;
import com.devsupdslist.dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/games")
@RestController
public class GameController {

    @Autowired private GameService service;

    @GetMapping
    public List<GameMinDTO> getAll(){
       List<GameMinDTO> result = service.findAll();
       return result;
    }
    @GetMapping(value = "/{id}")
    public GameMinDTO getById(@PathVariable Long id){
        GameMinDTO result = service.findById(id);
        return result;
    }

}
