package com.devSuperior.DSList.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devSuperior.DSList.dto.GameListDTO;
import com.devSuperior.DSList.entities.GameList;
import com.devSuperior.DSList.projections.GameMinProjection;
import com.devSuperior.DSList.repositories.GameListRepository;
import com.devSuperior.DSList.repositories.GameRepository;

@Service
public class GameListService {
    @Autowired
    private GameListRepository  gameListRepository;

    @Autowired
    private GameRepository gamerepository;
    
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List <GameList> dto = gameListRepository.findAll();
        return dto.stream().map(x -> new GameListDTO(x)).toList();
    }

    // função para mover os jogos de lugares
    @Transactional
    public void move(Long listId, int sourceIndex, int destinationIndex){
            List<GameMinProjection> list = gamerepository.searchByList(listId);
            GameMinProjection obj = list.remove(sourceIndex);
            list.add(destinationIndex,obj);

            int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
            int max = sourceIndex > destinationIndex ? sourceIndex : destinationIndex;

            for(int i = min; i <= max ; i++){
                gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
            }
    }
}
