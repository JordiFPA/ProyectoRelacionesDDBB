package uce.edu.ec.PersistenciaJPA.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uce.edu.ec.PersistenciaJPA.Models.Career;
import uce.edu.ec.PersistenciaJPA.Models.Teacher;
import uce.edu.ec.PersistenciaJPA.Repository.CareerRepository;
import uce.edu.ec.PersistenciaJPA.Repository.TeacherRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {
    @Autowired
    TeacherRepository teacherRepository;

    public List<Teacher> getAllTeacher() {
        return teacherRepository.findAll();
    }

    public Optional<Teacher> getTeacher(long id) {
        return teacherRepository.findById(id);
    }

    public void createTeacher(Teacher teacher) {
        teacherRepository.save(teacher);
    }

    public void updateTeacher(Teacher teacher) {
        teacherRepository.save(teacher);
    }

    public void deleteTeacher(long id) {
        teacherRepository.deleteById(id);
    }



}
