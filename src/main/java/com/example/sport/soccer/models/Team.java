package com.example.sport.soccer.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Team {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	@Column(name="team_ID")
	private Long id;
	@Column
	private String name;
	@Column
	private String owner;
	@Column
	private String stadium;
	@Column
	private Integer foundation;
	public Team(Long id, String name, String owner, String stadium, Integer foundation) {
		super();
		this.id = id;
		this.name = name;
		this.owner = owner;
		this.stadium = stadium;
		this.foundation = foundation;
	}
	public Team() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getStadium() {
		return stadium;
	}
	public void setStadium(String stadium) {
		this.stadium = stadium;
	}
	public Integer getFoundation() {
		return foundation;
	}
	public void setFoundation(Integer foundation) {
		this.foundation = foundation;
	}
	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", owner=" + owner + ", stadium=" + stadium + ", foundation="
				+ foundation + "]";
	}

}
