package com.example.sport.soccer.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Player {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	@Column(name="player_ID")
	private Long id;
	@Column
	private String name;
	@Column
	private Integer age;
	@Column
	private Integer number;
	@Column
	private String poste;
	public Player(Long id, String name, Integer age, Integer number, String poste) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.number = number;
		this.poste = poste;
	}
	public Player() {
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getPoste() {
		return poste;
	}
	public void setPoste(String poste) {
		this.poste = poste;
	}
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", age=" + age + ", number=" + number + ", poste=" + poste + "]";
	}
	
	

}
