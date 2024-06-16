package uce.edu.ec.PersistenciaJPA.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uce.edu.ec.PersistenciaJPA.Models.Classes;
import uce.edu.ec.PersistenciaJPA.Repository.ClassesRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ClassesService {

    @Autowired
    ClassesRepository classesRepository;
    public List<Classes> getAllCareers(){
        return classesRepository.findAll();
    }

    public Optional<Classes> getClass(long id){
        return classesRepository.findById(id);
    }

    public void createClass(Classes classes){
        classesRepository.save(classes);
    }

    public void updateClass(Classes classes){
        classesRepository.save(classes);
    }
    public void deleteClass(long id){
        classesRepository.deleteById(id);
    }

}


