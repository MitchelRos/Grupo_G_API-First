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


	public Alumno() {
		this.id = 0;
		this.name = "Ejemplo";
		this.surname = "Ejemplo";
		this.birthDate = LocalDateTime.now();
		this.timeEntry = LocalDateTime.now();
		this.timeExit = LocalDateTime.now();
		this.modul = new UF();
	}


	public Alumno(int id, String name, String surname, LocalDateTime birthDate, LocalDateTime horaEntrada,
			Date horaSortida, UF modul) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
		this.timeEntry = timeEntry;
		this.timeExit = timeExit;
		this.modul = modul;
	}

	public Alumno(int id, String name, String surname, LocalDate birthDate) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.birthDate = LocalDateTime.now();
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

	private String getDateString(LocalDateTime myDateObj) {
		//LocalDateTime myDateObj = LocalDateTime.now();  
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
		return myDateObj.format(myFormatObj);  
		

	}


	@Override
	public String toString() {
		return "Alumno [id=" + id + ", name=" + name + ", surname=" + surname + ", birthDate=" + ""
				+ ", timeEntry=" + getDateString(timeEntry) + ", timeExit=" + getDateString(timeExit) + ", modul=" + modul + "]";
	}



}