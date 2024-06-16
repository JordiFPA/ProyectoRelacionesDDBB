package uce.edu.ec.PersistenciaJPA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uce.edu.ec.PersistenciaJPA.Models.Career;

public interface CareerRepository  extends JpaRepository<Career,Long> {

}
