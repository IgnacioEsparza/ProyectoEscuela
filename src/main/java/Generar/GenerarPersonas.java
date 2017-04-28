/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generar;

import EscuelaPackage.Apoderado;
import EscuelaPackage.Asignatura;
import EscuelaPackage.Estudiante;
import EscuelaPackage.Notas;
import EscuelaPackage.Planificacion;
import EscuelaPackage.Profesor;
import java.util.ArrayList;
import java.util.Random;

/**
 * aqui se generan todos los tipos de personas que hay ennuestro colegio
 *
 * @author Ignacio Esparza
 */
public class GenerarPersonas {

    GetNombresRut gnr = new GetNombresRut();
    Random ra = new Random();

    public GenerarPersonas() {
    }

    /**
     *
     * @return notas random para los estudiantes
     */
    public Notas[] notasRandom() {
        Notas[] notas = new Notas[5];
        if (Math.random() < 0.5) {
            for (int i = 0; i < notas.length; i++) {
                notas[i] = new Notas(ra.nextInt(6) + 2);
            }
            return notas;
        } else {
            for (int i = 0; i < notas.length; i++) {
                notas[i] = new Notas(ra.nextInt(3) + 2);
            }
            return notas;
        }
    }

    public int asistRandom() {
        if (Math.random() < 0.5) {
            return ra.nextInt(150) + 30;
        } else {
            return ra.nextInt(30) + 150;
        }
    }

    /**
     *
     * @return retorna solo un numero raNDOM del 0 al 23
     */
    public int numRandom() {
        return ra.nextInt(23);
    }

    /**
     *
     * @return retorna un arreglo con los 30 estudiantes con datos personales
     * cada uno
     */
    public Estudiante[] estudiantes30() {
        //se crea el arreglo estudiante con capacidad máxima de 30
        Estudiante[] estudiante = new Estudiante[30];
        //se hace un arreglo de apoderados
        ArrayList<Apoderado> ap = apoderado();
        for (int i = 0; i < estudiante.length; i++) {
            //se llena el estudiante con los datos
            estudiante[i] = new Estudiante(gnr.nomAlumno(),
                    gnr.rutRandom(), ap.get(numRandom()),
                    asistRandom(), asignatura());
        }
        return estudiante;
    }

    /**
     *
     * @return un arraylist de tipo apoderado con datos aleatorios
     */
    public ArrayList<Apoderado> apoderado() {
        ArrayList<Apoderado> ap = new ArrayList();
        int rut = 1000;
        for (int i = 0; i < 23; i++) {
            rut++;
            ap.add(new Apoderado(gnr.nomApoderado(), String.valueOf(rut)));
        }
        return ap;
    }

    /**
     *
     * @param asign se le ingresa la asignatura que tendrá el profesor
     * @return un arreglo tipo profesor de tamaño 16
     */
    public Profesor[] profesor(Asignatura asign) {
        //se crea el arreglo profesor con un tamaño de 16
        Profesor[] pro = new Profesor[16];

        //se le entregan los nombre aleatorios al profesor
        String[] nomProfesor = gnr.nomProfesor();
        int rut = 700;
        for (int i = 0; i < pro.length; i++) {
            //se genera un rut que ronde los 700
            rut++;
            //se llena la informaciondel profesor
            pro[i] = new Profesor(nomProfesor[i], String.valueOf(rut),
                    asignProfes().get(i));
        }
        return pro;
    }

    /**
     * 0
     *
     * @return un arreglo tipo asignatura con las asignaturas disponibles en el
     * colegio, para los estudiantes
     */
    public Asignatura[] asignatura() {
        String[] materias = {"Matemáticas", "Lenguaje", "Historia", "inglés", "Ciencias"};
        Asignatura[] a = new Asignatura[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Asignatura(materias[i], notasRandom());
        }
        return a;
    }

    /**
     *
     * @return retorna las asignaturas del curso
     */
    public Asignatura[] asignaturaC() {
        String[] materias = {"Matemáticas", "Lenguaje", "Historia", "inglés", "Ciencias"};
        Asignatura[] a = new Asignatura[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Asignatura(materias[i], planes());
        }
        return a;
    }

    /**
     *
     * @return se retornan las planificaciones por defecto
     */
    public Planificacion[] planes() {
        Planificacion[] planes = new Planificacion[10];
        String[] planesEscritos = {"Unidad 1", "Unidad 2", "Prueba 1", "Revision Cuaderno 1",
            "Unidad 3", "Unidad 4 ", "Prueba 2", "Revision Cuaderno 2", "Unidad 5", "Prueba 3"};
        for (int i = 0; i < planes.length; i++) {
            planes[i] = new Planificacion(planesEscritos[i]);
        }
        return planes;
    }

    /**
     * habra 5 profesores con especialidad matematicas y 5 con especialidad
     * lengujae mientras que solo 2 con las especialidades de historia,
     * ciencias, e Inglés
     *
     * @return las asignaturas ordenadas para los profesores
     */
    public ArrayList<Asignatura> asignProfes() {
        ArrayList<Asignatura> asigna = new ArrayList();
        asigna.add(new Asignatura("Matemáticas"));
        asigna.add(new Asignatura("Matemáticas"));
        asigna.add(new Asignatura("Matemáticas"));
        asigna.add(new Asignatura("Matemáticas"));
        asigna.add(new Asignatura("Matemáticas"));
        asigna.add(new Asignatura("Lenguaje"));
        asigna.add(new Asignatura("Lenguaje"));
        asigna.add(new Asignatura("Lenguaje"));
        asigna.add(new Asignatura("Lenguaje"));
        asigna.add(new Asignatura("Lenguaje"));
        asigna.add(new Asignatura("Historia"));
        asigna.add(new Asignatura("Historia"));
        asigna.add(new Asignatura("Inglés"));
        asigna.add(new Asignatura("Inglés"));
        asigna.add(new Asignatura("Ciencias"));
        asigna.add(new Asignatura("Ciencias"));

        return asigna;
    }

}
