package com.personal.pojoobj;

public class Skills {
	
	private String name;
	private int duration;
	
	public Skills(String name, int duration) {
		super();
		this.name = name;
		this.duration = duration;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Skills [name=" + name + ", duration=" + duration + "]";
	}
	
	

}
