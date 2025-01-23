package com.devSuperior.DSList.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devSuperior.DSList.dto.GameListDTO;
import com.devSuperior.DSList.entities.GameList;
import com.devSuperior.DSList.repositories.GameListRepository;

@Service
public class GameListService {
    @Autowired
    private GameListRepository  gameListRepository;
    
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List <GameList> dto = gameListRepository.findAll();
        return dto.stream().map(x -> new GameListDTO(x)).toList();
    }
}
