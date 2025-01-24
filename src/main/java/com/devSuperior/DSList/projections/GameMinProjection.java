package com.devSuperior.DSList.projections;

public interface GameMinProjection {
    Long getId();
    String getTitle();
    int getYear(); // Certifique-se de que "game_year" é um inteiro no banco
    String getImgUrl();
    String getShortDescription();
    int getPosition();
}
