package net.Jaumebalmes.APIG.Repository;

import org.springframework.data.repository.CrudRepository;
import java.util.List;
import net.Jaumebalmes.APIG.Entities.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

    public List<Student> findAll();
}
