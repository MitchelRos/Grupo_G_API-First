package net.Jaumebalmes.APIG.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Curs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String cicle;
    private long curs;
    private String grup;
    private long aula;

    public Curs() {
        this.id = 0;
        this.cicle = "DAW";
        this.curs = 2;
        this.grup = this.cicle + this.curs;
        this.aula = 43;
    }

    public Curs(long id, String cicle, long curs, String grup, long aula) {
        this.id = id;
        this.cicle = cicle;
        this.curs = curs;
        this.grup = grup;
        this.aula = aula;
    }

    public Curs(long id, String cicle, long curs, long aula) {
        this.id = id;
        this.cicle = cicle;
        this.curs = curs;
        this.grup = this.cicle + this.curs;
        this.aula = aula;
    }

    // GETTERS
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCicle() {
        return cicle;
    }

    public void setCicle(String cicle) {
        this.cicle = cicle;
    }

    public long getCurs() {
        return curs;
    }

    public void setCurs(long curs) {
        this.curs = curs;
    }

    public String getGrup() {
        return grup;
    }

    public void setGrup(String grup) {
        this.grup = grup;
    }

    public long getAula() {
        return aula;
    }

    public void setAula(long aula) {
        this.aula = aula;
    }

    @Override
    public String toString() {
        return "Curs [cicle=" + cicle + ", curs=" + curs + ", grup=" + grup + ", aula=" + aula + "]";
    }

}
