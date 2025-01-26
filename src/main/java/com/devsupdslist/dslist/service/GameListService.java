package com.devsupdslist.dslist.service;

import com.devsupdslist.dslist.DTO.GameDTO;
import com.devsupdslist.dslist.DTO.GameListDTO;
import com.devsupdslist.dslist.DTO.GameMinDTO;
import com.devsupdslist.dslist.entities.Game;
import com.devsupdslist.dslist.entities.GameList;
import com.devsupdslist.dslist.projections.GameMinProjection;
import com.devsupdslist.dslist.repository.GameListRepository;
import com.devsupdslist.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    @Autowired private GameListRepository gameListRepository;
    @Autowired private GameRepository gameRepository;
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> ent = gameListRepository.findAll();
        return ent.stream().map(GameListDTO::new).toList();
    }
    @Transactional(readOnly = true)
    public GameListDTO findById(Long id){
        GameList ent = gameListRepository.findById(id).get();
        return new GameListDTO(ent);
    }
    @Transactional
    public void move(Long listId, int sourceIndex, int destinationIndex){
        List<GameMinProjection> list = gameRepository.searchByList(listId);
        GameMinProjection obj = list.remove(sourceIndex);
        list.add(destinationIndex, obj);
        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;

        for (int i = min; i <= max; i++){
            gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
        }


    }

}
