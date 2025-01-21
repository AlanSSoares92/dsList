package com.devsupdslist.dslist.service;

import com.devsupdslist.dslist.DTO.GameDTO;
import com.devsupdslist.dslist.entities.Game;
import com.devsupdslist.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired private GameRepository gameRepository;

    public List<GameDTO> findAll(){
        List<Game> ent = gameRepository.findAll();
        return ent.stream().map(GameDTO::new).toList();
    }

}
