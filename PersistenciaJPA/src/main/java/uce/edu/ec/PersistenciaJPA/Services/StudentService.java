package uce.edu.ec.PersistenciaJPA.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uce.edu.ec.PersistenciaJPA.Models.Student;
import uce.edu.ec.PersistenciaJPA.Repository.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudenty() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudent(long id) {
        return studentRepository.findById(id);
    }

    public void createStudent(Student student) {
        studentRepository.save(student);
    }

    public void updateStudent(Student student) {
        studentRepository.save(student);
    }

    public void deleteStudent(long id) {
        studentRepository.deleteById(id);
    }

}
