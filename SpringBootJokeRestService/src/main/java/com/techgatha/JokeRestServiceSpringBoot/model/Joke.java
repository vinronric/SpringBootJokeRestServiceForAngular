package com.techgatha.JokeRestServiceSpringBoot.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Joke {
	@Id
	private int id;
	private String setup;
	private String line;
	private String category;
	public Joke() {
		// TODO Auto-generated constructor stub
	}
	public Joke(String setup, String line, String category) {
		super();
		this.setup = setup;
		this.line = line;
		this.category = category;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSetup() {
		return setup;
	}
	public void setSetup(String setup) {
		this.setup = setup;
	}
	public String getLine() {
		return line;
	}
	public void setLine(String line) {
		this.line = line;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Joke [id=" + id + ", setup=" + setup + ", line=" + line + ", category=" + category + "]";
	}
	

}
