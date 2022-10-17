package net.Jaumebalmes.APIG;

import java.util.HashMap;

public class GenerateFakeData {

    // crea los datos de los alumnos
    private static HashMap<Integer, Student> studentList = new HashMap<>();
    private static HashMap<Integer, Curs> cursList = new HashMap<>();

    // Genera alumnos fake para la api
    public static HashMap<Integer, Student> generateStudents() {
        Student a1 = new Student(1, "Kevin", "Sama Villegas", "kevin@sama.com", "DAW2");
        Student a2 = new Student(2, "Mitchel", "Rosado", "mitchel@tailand.com", "DAW2");
        Student a3 = new Student(3, "Nagisa", "Shiota ", "nagishiota@clasee.com", "DAM1");
        Student a4 = new Student(4, "Karma", "Akabane", "karmaakabane@clasee.com", "DAW2");
        Student a5 = new Student(5, "Makoto", "Ito", "makotoito@schooldays.com", "DAM2");
        Student a6 = new Student(7, "Lluc", "Pirilla", "llucpirilla@arrels.com", "DAM2");
        Student a7 = new Student(13, "Benito", "Camela", "benitocamela@hub.com", "DAW2");
        Student a8 = new Student(100, "Cake", "Is A LIE", "cakeisalie@meme.com", "ASIX2");


        studentList.put(a1.getId(), a1);
        studentList.put(a2.getId(), a2);
        studentList.put(a3.getId(), a3);
        studentList.put(a4.getId(), a4);
        studentList.put(a5.getId(), a5);
        studentList.put(a6.getId(), a6);
        studentList.put(a7.getId(), a7);
        studentList.put(a8.getId(), a8);
        return studentList;
    }

    public static HashMap<Integer, Curs> generateCurs() {
        Curs c1 = new Curs(1, "DAW", 1, 43);
        Curs c2 = new Curs(2, "DAW", 2, 44);
        Curs c3 = new Curs(3, "ASIX", 1, 45);
        Curs c4 = new Curs(4, "ASIX", 2, 46);
        Curs c5 = new Curs(5, "DAM", 1, 47);
        Curs c6 = new Curs(6, "DAM", 2, 48);
        Curs c7 = new Curs(7, "SMX", 1, 43);
        Curs c8 = new Curs(8, "SMX", 2, 43);

        cursList.put(c1.getId(), c1);
        cursList.put(c2.getId(), c2);
        cursList.put(c3.getId(), c3);
        cursList.put(c4.getId(), c4);
        cursList.put(c5.getId(), c5);
        cursList.put(c6.getId(), c6);
        cursList.put(c7.getId(), c7);
        cursList.put(c8.getId(), c8);
        return cursList;
    }


}
