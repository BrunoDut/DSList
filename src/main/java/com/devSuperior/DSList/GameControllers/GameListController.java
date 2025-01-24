package com.devSuperior.DSList.GameControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devSuperior.DSList.dto.GameListDTO;
import com.devSuperior.DSList.dto.GameMinDTO;
import com.devSuperior.DSList.service.GameListService;
import com.devSuperior.DSList.service.GameService;

@RestController
@RequestMapping(value = "lists") /// adiciona o /lists no endereço do site
public class GameListController {
    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> finByList(@PathVariable Long listId){
        List<GameMinDTO>  result = gameService.findByList(listId);
        return result;
    }
}
