package com.game_list.controllers;

import com.game_list.dtos.GameDTO;
import com.game_list.dtos.GameListDTO;
import com.game_list.dtos.GameMinDTO;
import com.game_list.dtos.ReplacementDTO;
import com.game_list.services.GameListService;
import com.game_list.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId){
        List<GameMinDTO> result = gameService.findByList(listId);
        return result;
    }

    @PostMapping(value = "/{listId}/replacement")
    public void move(@PathVariable long listId, @RequestBody ReplacementDTO body){
        gameListService.move(listId,body.getSourceIndex(), body.getDestinationIndex());
    }

}
