package com.rcarvalho.dsmovie.repository;

import com.rcarvalho.dsmovie.entities.Score;
import com.rcarvalho.dsmovie.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
}
