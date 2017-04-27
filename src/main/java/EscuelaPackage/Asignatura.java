/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EscuelaPackage;

import java.util.Arrays;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
/**
 * se crea un objeto asignatura
 * @author Ignacio Esparza
 */
//@XmlRootElement(name="Asignatura")
@XmlType(propOrder={"materia","notas","actividades"})

public class Asignatura {

    private String materia;
    private Notas[] notas;
    private Planificacion [] actividades;

    public Asignatura() {
    }
    /**
     * 
     * @param materia se le ingresa la materia o asignatura 
     */
    public Asignatura(String materia) {
        this.materia = materia;
    }
    /**
     * 
     * @param materia ingreso de la materia con
     * @param actividades que son las planificaciones que puede tener el curso
     */
    public Asignatura(String materia, Planificacion[] actividades) {
        this.materia = materia;
        this.actividades = actividades;
    }
    
    /**
     * 
     * @param materia ingreso de la materia
     * @param notas ingreso de las notas 
     */
    public Asignatura(String materia, Notas[] notas) {
        this.materia = materia;
        this.notas = notas;
    }
    
    @XmlElement(name="notas")
    /**
     * retorna un arreglo de notas
     */
    public Notas[] getNotas() {
        return notas;
    }
    /**
     * 
     * @param notas se puede ingresar un arreglo de notas 
     */
    public void setNotas(Notas[] notas) {
        this.notas = notas;
    }
    
    /**
     * 
     * @param materia se puede ingrear la materia
     */
    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    /**
     * 
     * @param actividades se puede ingresar un arreglo de las actividades
     */
    public void setActividades(Planificacion[] actividades) {
        this.actividades = actividades;
    }
    
    @XmlElement(name="materia")
    /**
     * retorna la materia que se desea saber
     */
    public String getMateria() {
        return materia;
    }
    
    @XmlElement(name="actividades")
    /**
     * retorna un arreglo de actividades
     */
    public Planificacion[] getActividades() {
        return actividades;
    }

    @Override
    public String toString() {
        return "Materia : " + materia + "\nActividades : " + Arrays.toString(actividades);
    }
    
    
    
    
}
