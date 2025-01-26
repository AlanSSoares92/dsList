package com.devsupdslist.dslist.DTO;

import com.devsupdslist.dslist.entities.Game;
import jakarta.persistence.Column;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
public class GameDTO {
    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public GameDTO(){}
    public GameDTO(Game entity) {
        BeanUtils.copyProperties(entity, this);
    }
}
