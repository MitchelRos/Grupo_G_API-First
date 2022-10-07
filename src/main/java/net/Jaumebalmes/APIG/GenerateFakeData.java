package net.Jaumebalmes.APIG;

import java.time.LocalDateTime;
import java.util.HashMap;

public class GenerateFakeData {
	//crea los datos de los alumnos

	private static HashMap<Integer, Alumno> alumneList = new HashMap<>();
	private static HashMap<Integer, UF> ufList = new HashMap<>();

	public static HashMap<Integer, Alumno> generateAlumnes() {
		generateUF();
		Alumno a1 = new Alumno(1,"Pepo","Sama",LocalDateTime.of(1998, 3, 1, 12, 15),LocalDateTime.of(2022, 3, 1, 12, 15),ufList);
		Alumno a2 = new Alumno(2,"Kevin","Pirilla",LocalDateTime.of(2022, 3, 1, 12, 15),LocalDateTime.of(2022, 3, 1, 12, 15),ufList);
		Alumno a3 = new Alumno(3,"Joan","Pirilla",LocalDateTime.of(2022, 3, 1, 12, 15),LocalDateTime.of(2022, 3, 1, 12, 23),ufList);
		Alumno a4 = new Alumno(4,"Joan","Pirilla",LocalDateTime.of(2022, 3, 1, 12, 15),LocalDateTime.of(2022, 3, 1, 12, 15),ufList);
		Alumno a5 = new Alumno(5,"Raul","Parejo",LocalDateTime.of(2022, 3, 1, 12, 15),LocalDateTime.of(2022, 3, 1, 12, 45),ufList);
		Alumno a6 = new Alumno(6,"Luis","Pirilla",LocalDateTime.of(2022, 3, 1, 12, 15),LocalDateTime.of(2022, 3, 1, 12, 15),ufList);
		Alumno a7 = new Alumno(7,"Mitchel","Pirilla",LocalDateTime.of(2022, 3, 1, 12, 15),LocalDateTime.of(2022, 3, 1, 12, 12),ufList);
		Alumno a8 = new Alumno(13,"Benito","Camela",LocalDateTime.of(2022, 3, 1, 12, 15),LocalDateTime.of(2022, 3, 1, 12, 15),ufList);
		Alumno a9 = new Alumno(100,"Cake","Is A LIE",LocalDateTime.of(2022, 3, 1, 12, 15),LocalDateTime.of(2022, 3, 1, 12, 15),ufList);

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


	public static HashMap<Integer, UF> generateUF() {
		UF a1 = new UF(1,"UF1");
		UF a2 = new UF(2,"UF2");
		UF a3 = new UF(3,"UF3");
		UF a4 = new UF(4,"UF4");
		ufList.put(a1.getId(), a1);
		ufList.put(a2.getId(), a2);
		ufList.put(a3.getId(), a3);
		ufList.put(a4.getId(), a4);
		return ufList;
	}

}
