package com.rcarvalho.dsmovie.controller;

import com.rcarvalho.dsmovie.dto.MovieDTO;
import com.rcarvalho.dsmovie.dto.ScoreDTO;
import com.rcarvalho.dsmovie.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

    @Autowired
    private ScoreService service;

    @PutMapping
    public MovieDTO saveScore(@RequestBody ScoreDTO scoreDTO)
    {
        MovieDTO movieDto = service.saveScore(scoreDTO);
        return movieDto;

    }

}
