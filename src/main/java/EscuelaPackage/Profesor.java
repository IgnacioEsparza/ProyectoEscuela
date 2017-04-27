/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EscuelaPackage;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * la clase que creará el profesor de un curso en especifico
 * @author Ignacio Esparza
 */
//@XmlRootElement(name = "Profesor")
@XmlType(propOrder = {"nombre", "rut", "asignaturaP"})
public class Profesor {

    private String nombre;
    private String rut;
    private Asignatura asignaturaP;

    public Profesor() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setAsignaturaP(Asignatura asignaturaP) {
        this.asignaturaP = asignaturaP;
    }
    
    /**
     * 
     * @param nombre nombre del profesor
     * @param rut el rut o id que tendrá el profesor
     * @param asign la asignatura en la cual se especializa
     */
    public Profesor(String nombre, String rut, Asignatura asign) {
        this.nombre = nombre;
        this.rut = rut;
        this.asignaturaP = asign;
    }

    @XmlElement(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    @XmlElement(name = "rut")
    public String getRut() {
        return rut;
    }

    @XmlElement(name = "asignaturaP")
    public Asignatura getAsignaturaP() {
        return asignaturaP;
    }

    @Override
    public String toString() {
        return "\nNombre : " + nombre + "\nRut : " + rut + "\nAsignatura : " + asignaturaP;
    }

}
