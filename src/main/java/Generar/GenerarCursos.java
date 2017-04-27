/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generar;

import EscuelaPackage.Asignatura;
import EscuelaPackage.Curso;
import EscuelaPackage.Profesor;

/**
 * se encarga de creaR y llenar los cursos a y b
 * @author Ignacio Esparza
 */
public class GenerarCursos {

    GenerarPersonas gp = new GenerarPersonas();
    private Curso[] TCursos = new Curso[16];
    private Curso[] cursoa = new Curso[8];
    private Curso[] cursob = new Curso[8];

    //Curso curso1a = new Curso("A", 1, gp.estudiantes30(), Profe[0], asignatura.asignatura());
    public GenerarCursos() {
    }
    /**
     * 
     * @return un arreglo de curso ya llenado
     */
    public Curso[] CursosA() {
        Asignatura asignatura = new Asignatura();
        Profesor[] Profe = gp.profesor(asignatura);
        for (int i = 0; i < cursoa.length; i++) {
            //se ingresan los datos aleatorios con el for
            cursoa[i] = new Curso("A", i + 1, gp.estudiantes30(), Profe[i], gp.asignaturaC());
        }
        return cursoa;
    }
    
    /**
     * 
     * @return retorna los cursos b ya llenados con informacion 
     */
    public Curso[] CursosB() {

        Asignatura asignatura = new Asignatura();
        Profesor[] Profe = gp.profesor(asignatura);
        for (int i = 0; i < cursob.length; i++) {
            //se ingresan los datos aleatorios con el for
            cursob[i] = new Curso("B", i + 1, gp.estudiantes30(), Profe[i + 8], gp.asignaturaC());
        }
        return cursob;
    }
    
    /**
     * 
     * @return retorna arreglo curso donde estarán los cursos a y b usando
     * system.arraycopy para unir lo arreglos de los cursos a y b
     */
    public Curso[] CursosAB() {
        System.arraycopy(CursosA(), 0, TCursos, 0, CursosA().length);
        System.arraycopy(CursosB(), 0, TCursos, CursosA().length, CursosB().length);
        return TCursos;
    }
}
