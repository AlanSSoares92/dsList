package com.devsupdslist.dslist.DTO;

import com.devsupdslist.dslist.entities.Game;
import com.devsupdslist.dslist.projections.GameMinProjection;
import lombok.*;
import org.springframework.beans.BeanUtils;
public class GameMinDTO {
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(Game entity) {
        BeanUtils.copyProperties(entity, this);
    }

    public GameMinDTO() {
    }

    public GameMinDTO(GameMinProjection gameMinProjection) {
        BeanUtils.copyProperties(gameMinProjection, this);

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }
}
