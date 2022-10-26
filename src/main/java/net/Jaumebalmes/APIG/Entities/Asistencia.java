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
    private long id;
    private LocalDateTime fecha;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSalida;
    private long moduloid;
    private long alumnoid;

    public Asistencia(long id, LocalDateTime fecha, LocalDateTime horaEntrada, LocalDateTime horaSalida, long moduloid,
            long alumnoid) {
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

    public long getId() {
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

    public long getModuloid() {
        return moduloid;
    }

    public void setModuloid(int moduloid) {
        this.moduloid = moduloid;
    }

    public long getAlumnoid() {
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
