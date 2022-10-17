package net.Jaumebalmes.APIG;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //taula db
class Student{
  @Id //clau taula de la db
  @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String surname;
	private String email;
	private String grup;
  
    public Student(int id, String name, String surname, String email, String grup) {
        super();
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.grup = grup;
    }
    
    public Student() {
        super();
        this.id = 0;
        this.name = "";
        this.surname = "";
        this.email = "example@example.com";
        this.grup = "DAW2";
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGrup() {
        return grup;
    }

    public void setGrup(String grup) {
        this.grup = grup;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", surname=" + surname + ", email=" + email + ", grup=" + grup
                + "]";
    }
	
}