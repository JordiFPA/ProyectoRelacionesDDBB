package uce.edu.ec.PersistenciaJPA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uce.edu.ec.PersistenciaJPA.Models.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {


}
