package com.devSuperior.DSList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devSuperior.DSList.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
