package uce.edu.ec.PersistenciaJPA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uce.edu.ec.PersistenciaJPA.Models.Teacher;

public interface TeacherRepository  extends JpaRepository<Teacher,Long> {
}
