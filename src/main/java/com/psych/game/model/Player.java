package com.psych.game.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name= "players")
@EntityListeners(AuditingEntityListener.class)
public class Player extends Auditable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Getter
	@Setter
	private Long id;
	
	@NotBlank 
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name2) {
		// TODO Auto-generated method stub
		this.name=name2;
	}
}
