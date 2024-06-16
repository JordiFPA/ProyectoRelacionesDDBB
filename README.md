# ProyectoRelacionesDDBB
Estudiante: Jordi Pila

Este proyecto lo que se intenta emular es un sistema de matriculacion, asignacion de cursos, clases y profesores de una universidad.
Se utilizo Mysql como motor de base de datos, y Spring Data JPA para la persistencia de datos, ademas de aplicar los conocimientos
recibidos en clases.
El uso de relaciones que se nos planteo se lo abordo de la siguiente manera:
"One To One" en mi ejemplo, supondre que una un estudiante puede ser matriculado en una sola carrera y viceversa (1--------1)
"One to Many" en mi ejemplo, una carrera puede tener varias clases asociadas a ellas, es decir (1--------------n)
"Many to One" para que se cumpla los principios de base de datos, aqui aplique lo inverso de la anotacion anterior, es decir
muchas clases puedes ser exclusivamente de una carrera(n------1).
"Many to Many" para que se cumpla este principio, y en este ejemplo, supondre que varias clases pueden ser impartidas por varios
docente.(n------n).
Cabe mencionar que en esta anotacion, lo que se crea es una tabla intermedia.
