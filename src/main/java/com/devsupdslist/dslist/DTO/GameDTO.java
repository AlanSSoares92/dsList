package com.devsupdslist.dslist.DTO;

import com.devsupdslist.dslist.entities.Game;
import org.springframework.beans.BeanUtils;

import java.util.Objects;

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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
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

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameDTO gameDTO = (GameDTO) o;
        return Objects.equals(id, gameDTO.id) && Objects.equals(title, gameDTO.title) && Objects.equals(year, gameDTO.year) && Objects.equals(genre, gameDTO.genre) && Objects.equals(platforms, gameDTO.platforms) && Objects.equals(score, gameDTO.score) && Objects.equals(imgUrl, gameDTO.imgUrl) && Objects.equals(shortDescription, gameDTO.shortDescription) && Objects.equals(longDescription, gameDTO.longDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, year, genre, platforms, score, imgUrl, shortDescription, longDescription);
    }
}