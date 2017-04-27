/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EscuelaPackage;

import java.util.Arrays;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *  es la clase que se encargará de unificar todos los cursos
 * @author Ignacio Esparza
 */
@XmlRootElement(name="Colegio")
@XmlType(propOrder={"TCursos"})
public class Colegio {
    Curso [] TCursos;
    
    
    public Colegio() {
    }
    
    /**
     * resive un arreglo de cursos 
     * @param TCursos arreglo curso que debe contener los cursos a y los b 
     */
    public Colegio(Curso[] TCursos) {
        this.TCursos = TCursos;
    }
    
    @XmlElement(name="TCursos")
    /**
     * retorna los cursos
     */
    public Curso[] getTCursos() {
        return TCursos;
    }
    
    /**
     * 
     * @param TCursos se puede ingresar un arreglo de cursos 
     */
    public void setTCursos(Curso[] TCursos) {
        this.TCursos = TCursos;
    }

    @Override
    public String toString() {
        return "Cursos : " + Arrays.toString(TCursos);
    }
    
    
    
    
}
