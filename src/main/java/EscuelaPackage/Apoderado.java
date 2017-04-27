/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EscuelaPackage;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Clase crea un objeto Apoderado
 * @author Ignacio Esparza
 */
//@XmlRootElement(name="Apoderado")
@XmlType(propOrder={"nombre","rut","pupilo"})

public class Apoderado {
    private String nombre; //nombre del apoderado
    private String rut; //rut del apoderado
    private ArrayList<Estudiante> pupilo = new ArrayList(); //pupilos que tndrá el apoderado

    public Apoderado() {
    }
    
    /**
     * se crea un objeto apoderado con el nombre y el rut
     * @param nombre nombre del apoderadpo
     * @param rut  nombre del apoderado
     */
    public Apoderado(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
    }
    
    /**
     * Se le agrega un pupilo al apoderado a traves de e que es un objeto
     * Estudiante
     * @param e objeto estudiante que es vinculado al apoderado 
     */
    public void ApoderadoDe(Estudiante e){
        pupilo.add(e);
    }
    
    /**
     * retorna los pupilos
     * @return 
     */
    public String impPupilos(){
        String pupilos="";
        for (int i = 0; i <pupilo.size(); i++) {
            //System.out.println("|"+pupilo.get(i)+"|");
            pupilos = "\n|"+pupilo.get(i)+"|"+pupilos;
        }
        return pupilos;
    }
    /**
     * 
     * @return retorna el arreglo de estudiantes
     */
    @XmlElement(name="pupilo")
    public ArrayList<Estudiante> getPupilo() {
        return pupilo;
    }
    
    /**
     * 
     * @return retorna el nombre 
     */
    @XmlElement(name="nombre")
    public String getNombre() {
        return nombre;
    }
    
    /**
     * 
     * @return retorna el rut
     */
    @XmlElement(name="rut")
    public String getRut() {
        return rut;
    }
    
    /**
     * 
     * @param nombre se puede ingresar el nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * 
     * @param rut se puede ingresar el rut 
     */
    public void setRut(String rut) {
        this.rut = rut;
    }
    
    /**
     * 
     * @param pupilo se puede ingrear el pupilo 
     */
    public void setPupilo(ArrayList<Estudiante> pupilo) {
        this.pupilo = pupilo;
    }
    
    @Override
    public String toString() {
        return "Nombre :" + nombre + "\nRut :" + rut+"\nPupilo : "+pupilo;
    }
    
    
}
