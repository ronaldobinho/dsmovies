package com.rcarvalho.dsmovie.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter

@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "tb_score")
public class Score {
    @EmbeddedId
    private ScorePK id = new ScorePK();

    private Double value;


}
