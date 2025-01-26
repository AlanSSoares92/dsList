package com.devsupdslist.dslist.service;

import com.devsupdslist.dslist.DTO.GameDTO;
import com.devsupdslist.dslist.DTO.GameMinDTO;
import com.devsupdslist.dslist.entities.Game;
import com.devsupdslist.dslist.projections.GameMinProjection;
import com.devsupdslist.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired private GameRepository gameRepository;
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> ent = gameRepository.findAll();
        return ent.stream().map(GameMinDTO::new).toList();
    }
    @Transactional(readOnly = true)
    public GameMinDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        return new GameMinDTO(result);
    }
    @Transactional(readOnly = true)
    public List<GameMinDTO> searchByListId(Long listId){
        List<GameMinProjection> ent = gameRepository.searchByList(listId);
        return ent.stream().map(GameMinDTO::new).toList();
    }



}
