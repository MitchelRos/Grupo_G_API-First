package net.Jaumebalmes.APIG;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controler {
	@Autowired // = new StudentRepository()
	StudentRepository studentRep;
	private HashMap<Integer, Student> studentList = new HashMap<>();
	private HashMap<Integer, Curs> cursList = new HashMap<>();
	// private HashMap<Integer, UF> ufList = new HashMap<>();

	// Te muestra en web el html cuanod pones "..../" al final de local host
	@GetMapping("/")
	public String home() {
		return htmlString("src\\main\\resources\\static\\Index.html");

	}

	// Te muestra cuando pones "..../students" a todos los alumnos
	@GetMapping("students")
	public List<Student> getStudents() {
		List<Student> st1List = studentRep.findAll();
		return st1List;
		//studentList = GenerateFakeData.generateStudents();
		//return studentList;
	}

	@GetMapping("students/{mGroup}")
	public HashMap<Integer, Student> getStudentsByGroup(@PathVariable String mGroup) {
		studentList = GenerateFakeData.generateStudents();
		// Lista auxiliar para devolver solo la query por grupo
		HashMap<Integer, Student> groupAnimeList = new HashMap<>();
		for (Student s : studentList.values()) {
			// La busqueda se hace en mayuscula para evitar diferencias entre mayus y minus.
			if ((s.getGrup().toUpperCase()).matches((mGroup.toUpperCase()))) {
				groupAnimeList.put(s.getId(), s);
			}
		}
		return groupAnimeList;
	}

	// Te muestra al poner un id al final del link el alumno en concreto
	@GetMapping("student/{nId}")
	public Student getStudent(@PathVariable int nId) {
		Student st1 = studentRep.findById(nId).get();
		return st1;
		// studentList = GenerateFakeData.generateStudents();
		// return studentList.get(nId);
	}


	@GetMapping("cursos")
	public HashMap<Integer, Curs> getCursos() {
		cursList = GenerateFakeData.generateCurs();
		return cursList;
	}

	@GetMapping("cursos/{nId}")
	public Curs getCurs(@PathVariable int nId) {
		cursList = GenerateFakeData.generateCurs();
		return cursList.get(nId);
	}
	// Te devuelve el string del archivo que has puesto dentro cuando lo llamas
	private String htmlString(String link) {
		StringBuilder html = new StringBuilder();
		String results = "";
		try (FileReader flrd = new FileReader(link)) {
			try (BufferedReader bfrd = new BufferedReader(flrd)) {
				String val;
				while ((val = bfrd.readLine()) != null) {
					html.append(val);
				}
				results = html.toString();
			} catch (IOException e) {
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
