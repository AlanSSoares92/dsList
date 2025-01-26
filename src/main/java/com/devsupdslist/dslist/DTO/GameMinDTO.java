package com.devsupdslist.dslist.DTO;

import com.devsupdslist.dslist.entities.Game;
import lombok.*;
import org.springframework.beans.BeanUtils;
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public GameMinDTO(Game entity) {
        BeanUtils.copyProperties(entity, this);
    }

}
