package com.devsupdslist.dslist.DTO;

import com.devsupdslist.dslist.entities.GameList;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO(){}

    public GameListDTO(GameList entity){
        BeanUtils.copyProperties(entity, this);
    }
}
