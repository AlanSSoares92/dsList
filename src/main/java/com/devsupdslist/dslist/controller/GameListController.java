package com.devsupdslist.dslist.controller;

import com.devsupdslist.dslist.DTO.GameDTO;
import com.devsupdslist.dslist.DTO.GameListDTO;
import com.devsupdslist.dslist.DTO.GameMinDTO;
import com.devsupdslist.dslist.DTO.ReplacementDTO;
import com.devsupdslist.dslist.service.GameListService;
import com.devsupdslist.dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/lists")
@RestController
public class GameListController {

    @Autowired private GameListService gameListService;
    @Autowired private GameService service;

    @GetMapping
    public List<GameListDTO> getAll(){
       List<GameListDTO> result = gameListService.findAll();
       return result;
    }
    @GetMapping(value = "/{gameListId}/games")
    public List<GameMinDTO> gameListDTOS(@PathVariable Long gameListId){
        List<GameMinDTO> dto = service.searchByListId(gameListId);
        return dto;
    }
    @PostMapping(value = "/{listId}/replacement")
    public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body){
        gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());

    }

}
