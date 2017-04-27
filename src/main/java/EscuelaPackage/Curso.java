
package EscuelaPackage;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * uno de las clases mnas importantes, que es donde se crearan la mayoria de los objetos
 * para crear el colegio
 * @author Ignacio Esparza
 */
//@XmlRootElement(name="Curso")
@XmlType(propOrder={"nivel","letra","estudiante","profesor","asignaturaC"})
public class Curso {

    private String letra;
    private int nivel;
    Estudiante estudiante[];
    Profesor profesor;
    Asignatura [] asignaturaC;
    
    /**
     * se crea un objeto curso
     * @param letra letra del curso si es "a" o "b"
     * @param nivel el nivel puede ser de 1ero a 8vo
     * @param estudiante los estudiantes que no pueden ser mas de 30
     * @param profesor el punico profesor
     * @param asignaturaC la asignaturas que imparte el curso
     */
    public Curso(String letra, int nivel, Estudiante[] estudiante,
            Profesor profesor, Asignatura [] asignaturaC) {
        this.letra = letra;
        this.nivel = nivel;
        this.estudiante = estudiante;
        this.profesor = profesor;
        this.asignaturaC = asignaturaC;
    }
    
    public Curso() {
    }
    
    public void setLetra(String letra) {
        this.letra = letra;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setEstudiante(Estudiante[] estudiante) {
        this.estudiante = estudiante;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void setAsignaturaC(Asignatura [] asignaturaC) {
        this.asignaturaC = asignaturaC;
    }
    
    @XmlElement(name="letra")
    public String getLetra() {
        return letra;
    }
    @XmlElement(name="nivel")
    public int getNivel() {
        return nivel;
    }
    @XmlElement(name="estudiante")
    public Estudiante[] getEstudiante() {
        return estudiante;
    }
    @XmlElement(name="profesor")
    public Profesor getProfesor() {
        return profesor;
    }
    @XmlElement(name="asignatura")
    public Asignatura [] getAsignaturaC() {
        return asignaturaC;
    }
    /**
     * 
     * @return retorna todos los alumnos de un curso en especifico
     */
    public String getTodos() {
        String alumnos = "";
        for (int i = 0; i < estudiante.length; i++) {
            alumnos = estudiante[i] + alumnos;
        }
        return alumnos;
    }

    @Override
    public String toString() {
        return "\nCurso : " + nivel + " " + letra
                + "\n__________________________________________________________"
                + "\nEstudiantes : " + getTodos()
                + "\n__________________________________________________________"
                + "\nProfesor : " + profesor
                + "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^";
    }

}
