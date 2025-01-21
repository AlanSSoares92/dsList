package com.devsupdslist.dslist.repository;

import com.devsupdslist.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
