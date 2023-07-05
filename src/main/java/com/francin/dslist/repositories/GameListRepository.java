package com.francin.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.francin.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList,Long> {
	
}
