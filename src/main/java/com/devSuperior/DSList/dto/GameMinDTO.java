package com.devSuperior.DSList.dto;

import com.devSuperior.DSList.entities.Game;
import com.devSuperior.DSList.projections.GameMinProjection;

public class GameMinDTO {
      
    private Long Id;
    private String title;
    private int year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(Game entity) {
        Id = entity.getId();
        this.title = entity.getTitle();
        this.year = entity.getYear();
        this.imgUrl = entity.getImgUrl();
        this.shortDescription = entity.getShortDescription();
    }
    public GameMinDTO(GameMinProjection projection) {
        Id = projection.getId();
        this.title = projection.getTitle();
        this.year =projection.getYear();
        this.imgUrl = projection.getImgUrl();
        this.shortDescription = projection.getShortDescription();
    }

    public GameMinDTO(){

    }

    ///no DTO só precisa do GET
    public Long getId() {
        return Id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    

    
}
