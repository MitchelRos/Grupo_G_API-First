package net.Jaumebalmes.APIG;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;

import javax.naming.spi.DirStateFactory.Result;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controler {
	private HashMap<Integer, Alumno> alumneList = new HashMap<>();

	// Te muestra en web el html cuanod pones "..../" al final de local host
	@GetMapping("/")
	public String home() {
		return htmlString("src\\main\\resources\\static\\Index.html");

	}

	//Te muestra cuando pones "..../alumnes" a toodos los alumnos
	@GetMapping("alumnes")
	public HashMap<Integer, Alumno> getAlumnos(){
		alumneList = GenerateFakeData.generateAlumnes();
		return alumneList;
	}

	//Te muestra al poner un id al final del link el alumno en concreto
	@GetMapping("alumne/{nId}")
	public Alumno getAlumne(@PathVariable int nId){
		alumneList = GenerateFakeData.generateAlumnes();	
		return alumneList.get(nId);
	}

	//Te devuelve el string del archivo que has puesto dentro cuando lo llamas
	private String htmlString(String link) {
		StringBuilder html=new StringBuilder();
		String results="";
		try (FileReader flrd = new FileReader(link)) {
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










}
