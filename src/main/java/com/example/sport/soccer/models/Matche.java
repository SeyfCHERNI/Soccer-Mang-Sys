package com.example.sport.soccer.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Matche {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="MATCH_ID")
	private Long id;
	@Column(name="team1")
	private String team1;
	@Column
	private String team2;
	@Column
	private Integer scoreOne;
	@Column
	private Integer scoretwo;
	public Matche(Long id, String team1, String team2, Integer scoreOne, Integer scoretwo) {
		super();
		this.id = id;
		this.team1 = team1;
		this.team2 = team2;
		this.scoreOne = scoreOne;
		this.scoretwo = scoretwo;
	}
	public Matche() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTeam1() {
		return team1;
	}
	public void setTeam1(String team1) {
		this.team1 = team1;
	}
	public String getTeam2() {
		return team2;
	}
	public void setTeam2(String team2) {
		this.team2 = team2;
	}
	public Integer getScoreOne() {
		return scoreOne;
	}
	public void setScoreOne(Integer scoreOne) {
		this.scoreOne = scoreOne;
	}
	public Integer getScoretwo() {
		return scoretwo;
	}
	public void setScoretwo(Integer scoretwo) {
		this.scoretwo = scoretwo;
	}
	@Override
	public String toString() {
		return "Matche [id=" + id + ", team1=" + team1 + ", team2=" + team2 + ", scoreOne=" + scoreOne + ", scoretwo="
				+ scoretwo + "]";
	}
	

}
