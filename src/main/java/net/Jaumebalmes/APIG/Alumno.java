package net.Jaumebalmes.APIG;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


class Alumno{
	private int id;
	private String name;
	private String surname;
	private Date birthDate;
	private Date horaEntrada;
	private Date horaSortida;
	private UF modul;

	public Alumno() {
		this.id = 0;
		this.name = "Ejemplo";
		this.surname = "Ejemplo";
		this.birthDate = getDateExample();
		this.horaEntrada = getDateExample();
		this.horaSortida = getDateExample();
		this.modul = new UF();
	}


	public Alumno(int id, String name, String surname, Date birthDate, Date horaEntrada,
			Date horaSortida, UF modul) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
		this.horaEntrada = horaEntrada;
		this.horaSortida = horaSortida;
		this.modul = modul;
	}

	public Alumno(int id, String name, String surname, Date birthDate) {
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
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	private Date getDateExample() {
		String date_s = "2011-01-18 12:55:15"; 
		SimpleDateFormat dt = new SimpleDateFormat("yyyyy-mm-dd hh:mm:ss"); 
		Date date;
		try {
			date = (Date) dt.parse(date_s);
			return date;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;

		}
	}

}