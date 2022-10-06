package net.Jaumebalmes.APIG;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.time.LocalDate;
import java.util.HashMap;

import javax.naming.spi.DirStateFactory.Result;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controler {
	private HashMap<Integer, Alumno> alumneList = new HashMap<>();
	
	@GetMapping("/")
	public String home() {
		return htmlString();

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

	private String htmlString() {
		StringBuilder html=new StringBuilder();
		String results="";
		try (FileReader flrd = new FileReader("src\\main\\resources\\static\\Index.html")) {
			try(BufferedReader bfrd = new BufferedReader(flrd)){
				String val;
				while ((val=bfrd.readLine()) != null) {
					html.append(val);
				}
				results = html.toString();
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return results;
	}

	private void generateAlumnes() {
		Alumno a1 = new Alumno(1,"LLuc","Pirilla",LocalDate.of(2001, 3, 21));
		Alumno a2 = new Alumno(2,"Kevin","Pirilla",LocalDate.of(199, 1, 19));
		Alumno a3 = new Alumno(3,"Joan","Pirilla",LocalDate.of(1997, 4, 11));
		Alumno a4 = new Alumno(4,"Joan","Pirilla",LocalDate.of(1997, 4, 11));
		Alumno a5 = new Alumno(5,"Raul","Parejo",LocalDate.of(2002, 1, 29));
		Alumno a6 = new Alumno(6,"Luis","Pirilla",LocalDate.of(1995, 3, 15));
		Alumno a7 = new Alumno(7,"Mitchel","Pirilla",LocalDate.of(1992, 1, 20));
		Alumno a8 = new Alumno(8,"Benito","Camela",LocalDate.of(1997, 4, 11));
		Alumno a9 = new Alumno(100,"Cake","Is A LIE",LocalDate.of(1111, 1, 12));
		
		alumneList.put(a1.getId(), a1);
		alumneList.put(a2.getId(), a2);
		alumneList.put(a3.getId(), a3);
		alumneList.put(a4.getId(), a4);
		alumneList.put(a5.getId(), a5);
		alumneList.put(a6.getId(), a6);
		alumneList.put(a7.getId(), a7);
		alumneList.put(a8.getId(), a8);
		alumneList.put(a9.getId(), a9);

	}
	
	
	
	


}
