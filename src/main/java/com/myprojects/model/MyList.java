package com.myprojects.model;

import java.time.LocalDate;

public class MyList {

	private int id;
	private String name;
	private String description;
	private LocalDate targetDate;
	private boolean done;
	
	public MyList(int id, String name, String description, LocalDate targetDate, boolean done) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.targetDate = targetDate;
		this.done = done;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	@Override
	public String toString() {
		return "MyList [id=" + id + ", name=" + name + ", description=" + description + ", targetDate=" + targetDate
				+ ", done=" + done + "]";
	}
	
}
