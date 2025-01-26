package com.devsupdslist.dslist.service;

import com.devsupdslist.dslist.DTO.GameDTO;
import com.devsupdslist.dslist.DTO.GameListDTO;
import com.devsupdslist.dslist.DTO.GameMinDTO;
import com.devsupdslist.dslist.entities.Game;
import com.devsupdslist.dslist.entities.GameList;
import com.devsupdslist.dslist.repository.GameListRepository;
import com.devsupdslist.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired private GameListRepository gameListRepository;
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> ent = gameListRepository.findAll();
        return ent.stream().map(GameListDTO::new).toList();
    }

}
