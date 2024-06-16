package uce.edu.ec.PersistenciaJPA.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uce.edu.ec.PersistenciaJPA.Models.Career;
import uce.edu.ec.PersistenciaJPA.Repository.CareerRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CareerService {

    @Autowired
    CareerRepository careerRepository;

    public List<Career> getAllCareers() {
        return careerRepository.findAll();
    }

    public Optional<Career> getStudent(long id) {
        return careerRepository.findById(id);
    }

    public void createCareer(Career career) {
        careerRepository.save(career);
    }

    public void updateCareer(Career career) {
        careerRepository.save(career);
    }

    public void deleteCareer(long id) {
        careerRepository.deleteById(id);
    }

}

