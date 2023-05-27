package com.francin.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.francin.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game,Long> {
	
}
