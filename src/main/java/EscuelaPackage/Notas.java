/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EscuelaPackage;

/**
 * notas que tendran los estudiantes
 * @author Ignacio Esparza
 */
public class Notas {
    private double notas;

    public Notas() {
    }
    
    /**
     * 
     * @param notas se ingresará una nota en especifico
     */
    public Notas(double notas) {
        this.notas = notas;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }

   
}
