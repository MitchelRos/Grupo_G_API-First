package net.Jaumebalmes.APIG.Entities;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Asistencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDateTime fecha;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSalida;
    private int moduloid;
    private int alumnoid;

    public Asistencia(int id, LocalDateTime fecha, LocalDateTime horaEntrada, LocalDateTime horaSalida, int moduloid,
            int alumnoid) {
        this.id = id;
        this.fecha = fecha;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.moduloid = moduloid;
        this.alumnoid = alumnoid;
    }

    public Asistencia() {
        this.id = 0;
        this.fecha = null;
        this.horaEntrada = null;
        this.horaSalida = null;
        this.moduloid = 0;
        this.alumnoid = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public LocalDateTime gethoraEntrada() {
        return horaEntrada;
    }

    public void sethoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime gethoraSalida() {
        return horaSalida;
    }

    public void sethoraSalida(LocalDateTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public int getModuloid() {
        return moduloid;
    }

    public void setModuloid(int moduloid) {
        this.moduloid = moduloid;
    }

    public int getAlumnoid() {
        return alumnoid;
    }

    public void setAlumnoid(int alumnoid) {
        this.alumnoid = alumnoid;
    }

    @Override
    public String toString() {
        return "Asistencia [id=" + id + ", fecha=" + fecha + ", horaEntrada=" + horaEntrada + ", horaSalida="
                + horaSalida + ", moduloid=" + moduloid + ", alumnoid=" + alumnoid + "]";
    }

}
