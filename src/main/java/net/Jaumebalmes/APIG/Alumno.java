package net.Jaumebalmes.APIG;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

class Alumno{
    private int id;
    private String name;
    private String surname;
    private LocalDate birthDate;
    
    public Alumno() {
		this.id = 0;
		this.name = "Ejemplo";
		this.surname = "Ejemplo";
		this.birthDate = LocalDate.of(2022, 1, 11);
	}

	public Alumno(int id, String name, String surname, LocalDate birthDate) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
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
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
    
    
    
}