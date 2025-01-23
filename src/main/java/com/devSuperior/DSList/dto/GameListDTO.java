package com.devSuperior.DSList.dto;

import com.devSuperior.DSList.entities.GameList;

public class GameListDTO {
    private long id;
    private String name;


    public GameListDTO(GameList entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }

    public GameListDTO() {
    }
    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    

    
}
