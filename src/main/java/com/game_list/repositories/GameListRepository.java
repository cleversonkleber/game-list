package com.game_list.repositories;

import com.game_list.entities.GameList;
import com.game_list.services.GameService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
