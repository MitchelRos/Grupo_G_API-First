package net.Jaumebalmes.APIG;

import java.time.LocalDate;
import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controler {
	private HashMap<Integer, Alumno> alumneList = new HashMap<>();
	
	@GetMapping("/")
	public String home() {
		String html_page = "<!DOCTYPE html><html><head><title>Home</title></head><body>Examples paths<ul><li> <a href=\"/alumnes\">Alumnes</a></li><li> <a href=\"/alumne/1\">Alumnes:id</a> </li></ul></ul></body></html>";
		return html_page;
	}
	
	
	
	@GetMapping("alumnes")
	public HashMap<Integer, Alumno> getAlumnos(){
		generateAlumnes();
		return alumneList;
	}
	
	
	@GetMapping("alumne/{nId}")
	public Alumno getAlumne(@PathVariable int nId){
		generateAlumnes();	
		return alumneList.get(nId);
	}


	private void generateAlumnes() {
		Alumno a1 = new Alumno(12,"LLuc","Pirilla",LocalDate.of(2001, 3, 21));
		Alumno a2 = new Alumno(42,"Kevin","Pirilla",LocalDate.of(199, 1, 19));
		Alumno a3 = new Alumno(30,"Joan","Pirilla",LocalDate.of(1997, 4, 11));
		Alumno a4 = new Alumno(10,"Joan","Pirilla",LocalDate.of(1997, 4, 11));
		Alumno a5 = new Alumno(40,"Raul","Parejo",LocalDate.of(2002, 1, 29));
		Alumno a6 = new Alumno(23,"Luis","Pirilla",LocalDate.of(1995, 3, 15));
		Alumno a7 = new Alumno(60,"Mitchel","Pirilla",LocalDate.of(1992, 1, 20));
		Alumno a8 = new Alumno(13,"Benito","Camela",LocalDate.of(1997, 4, 11));
		
		alumneList.put(a1.getId(), a1);
		alumneList.put(a2.getId(), a2);
		alumneList.put(a3.getId(), a3);
		alumneList.put(a4.getId(), a4);
		alumneList.put(a5.getId(), a5);
		alumneList.put(a6.getId(), a6);
		alumneList.put(a7.getId(), a7);
		alumneList.put(a8.getId(), a8);


	}
	
	
	
	


}
