package com.devsupdslist.dslist.controller;

import com.devsupdslist.dslist.DTO.GameDTO;
import com.devsupdslist.dslist.DTO.GameListDTO;
import com.devsupdslist.dslist.DTO.GameMinDTO;
import com.devsupdslist.dslist.service.GameListService;
import com.devsupdslist.dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/lists")
@RestController
public class GameListController {

    @Autowired private GameListService GameListService;

    @GetMapping
    public List<GameListDTO> getAll(){
       List<GameListDTO> result = GameListService.findAll();
       return result;
    }
}
