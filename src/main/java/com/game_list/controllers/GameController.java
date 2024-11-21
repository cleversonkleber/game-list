package com.game_list.controllers;

import com.game_list.dtos.GameDTO;
import com.game_list.dtos.GameMinDTO;
import com.game_list.dtos.ReplacementDTO;
import com.game_list.services.GameListService;
import com.game_list.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping(value = "/games")
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id){
        GameDTO result = gameService.findById(id);
        return result;
    }

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }



}
