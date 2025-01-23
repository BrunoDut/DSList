package com.devSuperior.DSList.GameControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devSuperior.DSList.dto.GameMinDTO;
import com.devSuperior.DSList.service.GameService;

@RestController
@RequestMapping(value = "/games") //configurando o caminho para minha api
public class GameController { // controla a porta de entrada do backend;
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> finAll(){
        List<GameMinDTO>  result = gameService.findAll();
        return result;
    }

}
