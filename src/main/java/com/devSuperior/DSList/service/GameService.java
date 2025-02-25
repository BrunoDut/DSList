package com.devSuperior.DSList.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devSuperior.DSList.dto.GameDTO;
import com.devSuperior.DSList.dto.GameMinDTO;
import com.devSuperior.DSList.entities.Game;
import com.devSuperior.DSList.projections.GameMinProjection;
import com.devSuperior.DSList.repositories.GameRepository;


//registrar o componente no frame works para ele configurar

@Service
public class GameService {

    @Autowired
    private GameRepository gamerepository; // intanciar o repositorio
    
    @Transactional(readOnly = true) /// abre a consulta eu não vou fazer nenhuma operação de escrita
    public GameDTO findbyId(Long id){
        Game result = gamerepository.findById(id).get(); // não faz o tratamento de caso não exista o is
        GameDTO dto = new GameDTO(result);
        return dto;
    }
    
    public List<GameMinDTO> findAll() {
    List<Game> result = gamerepository.findAll();
    List <GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        // stream do java, permite oprações com sequencias de dados exemplo o map que transforma o dados da maneira que vc quer
        //.toList() converte de volta para uma lista
        return dto;
    }; // devolve uma lista de objetos

    public List<GameMinDTO> findByList(Long listId) {
    List<GameMinProjection> result = gamerepository.searchByList(listId);
    return result.stream().map(x -> new GameMinDTO(x)).toList();
    }; // devolve uma lista de objetos

}
