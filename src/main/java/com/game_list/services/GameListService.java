package com.game_list.services;

import com.game_list.dtos.GameDTO;
import com.game_list.dtos.GameListDTO;
import com.game_list.dtos.GameMinDTO;
import com.game_list.entities.Game;
import com.game_list.entities.GameList;
import com.game_list.repositories.GameListRepository;
import com.game_list.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;


    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(GameListDTO::new).toList();
    }
}
