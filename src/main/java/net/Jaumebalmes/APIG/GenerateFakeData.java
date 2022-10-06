package net.Jaumebalmes.APIG;

import java.time.LocalDateTime;
import java.util.HashMap;

public class GenerateFakeData {
	//crea los datos de los alumnos
	public static HashMap<Integer, Alumno> generateAlumnes() {
		HashMap<Integer, Alumno> alumneList = new HashMap<>();
		Alumno a1 = new Alumno(1,"Pepo","Sama",LocalDateTime.of(1998, 3, 1, 12, 15),LocalDateTime.of(2022, 3, 1, 12, 15),LocalDateTime.of(2022, 3, 1, 12, 15),new UF(1,"spring"));
		Alumno a2 = new Alumno(2,"Kevin","Pirilla",LocalDateTime.of(2001, 3, 1, 8, 15),LocalDateTime.of(2022, 3, 1, 12, 15),LocalDateTime.of(2022, 3, 1, 12, 15),new UF(2,"server"));
		Alumno a3 = new Alumno(3,"Joan","Pirilla",LocalDateTime.of(2002, 3, 1, 12, 15),LocalDateTime.of(2022, 3, 1, 12, 15),LocalDateTime.of(2022, 3, 1, 12, 23),new UF(3,"php"));
		Alumno a4 = new Alumno(4,"Joan","Pirilla",LocalDateTime.of(2000, 3, 1, 12, 15),LocalDateTime.of(2022, 3, 1, 12, 15),LocalDateTime.of(2022, 3, 1, 12, 15),new UF(4,"java"));
		Alumno a5 = new Alumno(5,"Raul","Parejo",LocalDateTime.of(1999, 3, 1, 12, 15),LocalDateTime.of(2022, 3, 1, 12, 15),LocalDateTime.of(2022, 3, 1, 12, 45),new UF(1,"web"));
		Alumno a6 = new Alumno(6,"Luis","Pirilla",LocalDateTime.of(1996, 3, 1, 12, 15),LocalDateTime.of(2022, 3, 1, 12, 15),LocalDateTime.of(2022, 3, 1, 12, 15),new UF(1,"web"));
		Alumno a7 = new Alumno(7,"Mitchel","Pirilla",LocalDateTime.of(2001, 3, 1, 12, 15),LocalDateTime.of(2022, 3, 1, 12, 15),LocalDateTime.of(2022, 3, 1, 12, 12),new UF(1,"web"));
		Alumno a8 = new Alumno(13,"Benito","Camela",LocalDateTime.of(2000, 3, 1, 12, 15),LocalDateTime.of(2022, 3, 1, 12, 15),LocalDateTime.of(2022, 3, 1, 12, 15),new UF(1,"web"));
		Alumno a9 = new Alumno(100,"Cake","Is A LIE",LocalDateTime.of(2002, 3, 1, 12, 15),LocalDateTime.of(2022, 3, 1, 12, 15),LocalDateTime.of(2022, 3, 1, 12, 15),new UF(1,"web"));

		alumneList.put(a1.getId(), a1);
		alumneList.put(a2.getId(), a2);
		alumneList.put(a3.getId(), a3);
		alumneList.put(a4.getId(), a4);
		alumneList.put(a5.getId(), a5);
		alumneList.put(a6.getId(), a6);
		alumneList.put(a7.getId(), a7);
		alumneList.put(a8.getId(), a8);
		alumneList.put(a9.getId(), a9);
		return alumneList;

	}

}
