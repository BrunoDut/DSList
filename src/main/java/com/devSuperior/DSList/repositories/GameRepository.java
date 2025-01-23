package com.devSuperior.DSList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devSuperior.DSList.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
 // o proprio frame works fez a configuração necessaria <objeto, tipo da Id>

}
 