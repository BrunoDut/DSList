package com.devSuperior.DSList.dto;

import com.devSuperior.DSList.entities.Game;

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
