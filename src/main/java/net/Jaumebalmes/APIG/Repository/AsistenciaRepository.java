package net.Jaumebalmes.APIG.Repository;
import org.springframework.data.repository.CrudRepository;
import java.util.List;
import net.Jaumebalmes.APIG.Entities.Asistencia;

public interface AsistenciaRepository extends CrudRepository<Asistencia, Long> {

    public List<Asistencia> findAll();
}
