package net.Jaumebalmes.APIG.Repository;

import org.springframework.data.repository.CrudRepository;
import java.util.List;
import net.Jaumebalmes.APIG.Entities.Curs;

public interface CursRepository extends CrudRepository<Curs, Long> {

    public List<Curs> findAll();
}
