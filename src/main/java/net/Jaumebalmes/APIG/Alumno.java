package net.Jaumebalmes.APIG;

import java.time.LocalDateTime;
import java.util.HashMap;

class Alumno{
	private int id;
	private String name;
	private String surname;
	private LocalDateTime timeEntry;
	private LocalDateTime timeExit;
	private HashMap<Integer, UF> modul;
	public Alumno(int id, String name, String surname, LocalDateTime timeEntry, LocalDateTime timeExit,
			HashMap<Integer, UF> modul) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.timeEntry = timeEntry;
		this.timeExit = timeExit;
		this.modul = modul;
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
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public LocalDateTime getTimeEntry() {
		return timeEntry;
	}
	public void setTimeEntry(LocalDateTime timeEntry) {
		this.timeEntry = timeEntry;
	}
	public LocalDateTime getTimeExit() {
		return timeExit;
	}
	public void setTimeExit(LocalDateTime timeExit) {
		this.timeExit = timeExit;
	}
	public HashMap<Integer, UF> getModul() {
		return modul;
	}
	public void setModul(HashMap<Integer, UF> modul) {
		this.modul = modul;
	}
	@Override
	public String toString() {
		return "Alumno [id=" + id + ", name=" + name + ", surname=" + surname + ", timeEntry=" + timeEntry
				+ ", timeExit=" + timeExit + ", modul=" + modul + "]";
	}

}