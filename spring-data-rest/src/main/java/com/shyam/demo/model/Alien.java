package com.shyam.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Alien {

	@Id
	@GeneratedValue
	private int aid;
	private String aname;
	private String lang;

	public Alien() {
	}

	public Alien(int aid, String aname, String lang) {
		this.aid = aid;
		this.aname = aname;
		this.lang = lang;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	@Override
	public String toString() {
		return "Alien[Id: " + this.aid + ", Name: " + this.aname + ", Tech: " + this.lang + "]";
	}
}
