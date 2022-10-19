package net.Jaumebalmes.APIG;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer>{
    public List<Student> findAll();
}
