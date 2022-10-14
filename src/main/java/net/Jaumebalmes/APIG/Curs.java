package net.Jaumebalmes.APIG;

public class Curs {
    private int id;
    private String cicle;
    private int curs;
    private String grup;
    private int aula;

    public Curs() {
        this.id = 0;
        this.cicle = "DAW";
        this.curs = 2;
        this.grup = this.cicle + this.curs;
        this.aula = 43;
    }

    public Curs(int id, String cicle, int curs, String grup, int aula) {
        this.id = id;
        this.cicle = cicle;
        this.curs = curs;
        this.grup = grup;
        this.aula = aula;
    }

    public Curs(int id, String cicle, int curs, int aula) {
        this.id = id;
        this.cicle = cicle;
        this.curs = curs;
        this.grup = this.cicle + this.curs;
        this.aula = aula;
    }

    // GETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCicle() {
        return cicle;
    }

    public void setCicle(String cicle) {
        this.cicle = cicle;
    }

    public int getCurs() {
        return curs;
    }

    public void setCurs(int curs) {
        this.curs = curs;
    }

    public String getGrup() {
        return grup;
    }

    public void setGrup(String grup) {
        this.grup = grup;
    }

    public int getAula() {
        return aula;
    }

    public void setAula(int aula) {
        this.aula = aula;
    }

    @Override
    public String toString() {
        return "Curs [cicle=" + cicle + ", curs=" + curs + ", grup=" + grup + ", aula=" + aula + "]";
    }

}
