package net.Jaumebalmes.APIG;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.Jaumebalmes.APIG.Entities.Curs;
import net.Jaumebalmes.APIG.Entities.Student;
import net.Jaumebalmes.APIG.Repository.CursRepository;
import net.Jaumebalmes.APIG.Repository.StudentRepository;

@RestController
public class Controler {
	@Autowired // = new StudentRepository()
	StudentRepository studentRep;

	@Autowired // = new StudentRepository()
	CursRepository cursRep;

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
	}

	// Te muestra al poner un id al final del link el alumno en concreto
	@GetMapping("student/{nId}")
	public Student getStudent(@PathVariable int nId) {
		Student st1 = studentRep.findById(nId).get();
		return st1;
	}

	// Te muestra cuando pones "..../cursos" a todos los cursos
	@GetMapping("cursos")
	public List<Curs> getCursos() {
		List<Curs> cursList = cursRep.findAll();
		return cursList;
	}

	// Te muestra al poner un id al final del link el curso en concreto
	@GetMapping("cursos/{nId}")
	public Curs getCurs(@PathVariable int nId) {
		Curs c1 = cursRep.findById(nId).get();
		return c1;
	}

	// Te muestra al poner /students?grup los alumunos de ese grupo
	@RequestMapping(value = "/students", params = "grup")
	public List<Student> getStudentGroup(@RequestParam(defaultValue = "daw2") String grup) {
		List<Student> st1List = studentRep.findAll();
		List<Student> st1FilterList = new ArrayList<>();
		for (Student s : st1List) {
			// if ((s.getGrup().toUpperCase()).contains((grup.toUpperCase()))) {
			if ((s.getGrup().toUpperCase()).matches((grup.toUpperCase()))) {
				// La busqueda se hace en mayuscula para evitar diferencias entre mayus y minus.
				st1FilterList.add(s);
			}
		}
		return st1FilterList;
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
