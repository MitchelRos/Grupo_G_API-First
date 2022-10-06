package net.Jaumebalmes.APIG;

import java.util.Date;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


class Alumno{
	private int id;
	private String name;
	private String surname;
	private LocalDateTime birthDate;
	private LocalDateTime timeEntry;
	private LocalDateTime timeExit;
	private UF modul;
	public Alumno(int id, String name, String surname, LocalDateTime birthDate, LocalDateTime timeEntry,
			LocalDateTime timeExit, UF modul) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
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
	public LocalDateTime getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDateTime birthDate) {
		this.birthDate = birthDate;
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
	public UF getModul() {
		return modul;
	}
	public void setModul(UF modul) {
		this.modul = modul;
	}





}