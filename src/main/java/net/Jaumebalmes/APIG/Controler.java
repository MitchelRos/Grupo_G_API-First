package net.Jaumebalmes.APIG;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controler {
	private ArrayList<Alumno> alumneList = new ArrayList<Alumno>();
	
	@GetMapping("/hello")
	public String bonaTarda() {
		return "<h1>bona tarda</h1>";
	}
	
	
	@GetMapping("alumnes")
	public List<Alumno> getAlumnos(){
		generateAlumnes();
		return alumneList;
	}
	
	
	@GetMapping("alumne/{nId}")
	public Alumno getAlumne(@PathVariable int nId){
		generateAlumnes();
		return alumneList.get(nId-1);
	}


	private void generateAlumnes() {
		alumneList.add(new Alumno(1,"LLuc","Pirilla",LocalDate.of(2001, 3, 21)));
		alumneList.add(new Alumno(2,"Kevin","Pirilla",LocalDate.of(199, 1, 19)));
		alumneList.add(new Alumno(3,"Joan","Pirilla",LocalDate.of(1997, 4, 11)));
		alumneList.add(new Alumno(4,"Raul","Pirilla",LocalDate.of(2002, 1, 29)));
		alumneList.add(new Alumno(5,"Luis","Pirilla",LocalDate.of(1995, 3, 15)));
		alumneList.add(new Alumno(6,"Mitchel","Pirilla",LocalDate.of(1992, 1, 20)));

	}
	
	
	
	


}
