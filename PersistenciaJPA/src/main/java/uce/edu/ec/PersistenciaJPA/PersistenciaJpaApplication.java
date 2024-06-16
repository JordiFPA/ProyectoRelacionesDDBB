package uce.edu.ec.PersistenciaJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import uce.edu.ec.PersistenciaJPA.Models.Career;
import uce.edu.ec.PersistenciaJPA.Models.Classes;
import uce.edu.ec.PersistenciaJPA.Models.Student;
import uce.edu.ec.PersistenciaJPA.Models.Teacher;
import uce.edu.ec.PersistenciaJPA.Services.CareerService;
import uce.edu.ec.PersistenciaJPA.Services.ClassesService;
import uce.edu.ec.PersistenciaJPA.Services.StudentService;
import uce.edu.ec.PersistenciaJPA.Services.TeacherService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jordi Pila"
 * theme@ Proyecto Persistencia
 */

@SpringBootApplication
public class PersistenciaJpaApplication implements CommandLineRunner {

	@Autowired
	private StudentService studentService;

	@Autowired
	private CareerService careerService;

	@Autowired
	private ClassesService classesService;

	@Autowired
	private TeacherService teacherService; // Agrega el servicio de Profesor si no lo tienes

	public static void main(String[] args) {
		SpringApplication.run(PersistenciaJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Crear una lista de clases
		List<Classes> classes = new ArrayList<>();

		// Crear una carrera
		Career career = new Career(1, "Ingenieria en computacion", "Te va a hacer llorar", classes, 5);
		careerService.createCareer(career);

		// Crear un profesor
		Teacher teacher = new Teacher(1, "Juan", "Perez");
		teacherService.createTeacher(teacher);


		// Crear clases y establecer la relación con el profesor
		Classes cl1 = new Classes(1, "Programacion Avanzada 1", "Modelos 2D y 3D", 6, career);
		Classes cl2 = new Classes(2, "Programacion Avanzada 2", "Spring y Anotaciones", 6, career);

		// Establecer la relación muchos a muchos
		cl1.getTeachers().add(teacher);
		cl2.getTeachers().add(teacher);

		// Guardar las clases y profesor
		classesService.createClass(cl1);
		classesService.createClass(cl2);

		// Agregar las clases a la lista de la carrera y actualizar la carrera
		classes.add(cl1);
		classes.add(cl2);
		career.setClasslist(classes);
		careerService.updateCareer(career);

		// Crear un estudiante relacionado con la carrera
		Student s1 = new Student(1, "Jordi", "Pila", "jfpila@uce.edu.ec", 6, career);
		studentService.createStudent(s1);
	}
}
