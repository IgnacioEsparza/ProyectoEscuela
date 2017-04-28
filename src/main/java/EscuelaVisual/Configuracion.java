/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EscuelaVisual;

import EscuelaPackage.Apoderado;
import EscuelaPackage.Colegio;
import EscuelaPackage.Estudiante;
import Generar.GuardarXML;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Ignacio Esparza
 */
public class Configuracion {

    GuardarXML gx = new GuardarXML();
    Colegio college=gx.cargar();
    Set<String> ap = new TreeSet();
    ArrayList<Estudiante> es = new ArrayList();

    

    public ArrayList<Estudiante> buscarApo(String nApoderado) {
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 30; j++) {
                if (college.getTCursos()[i].getEstudiante()[j].getApoderado().getNombre().equals(nApoderado)) {
                    es.add(college.getTCursos()[i].getEstudiante()[j]);
                }
            }
        }
        return es;
    }

    public Set obtenerApo() {
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 30; j++) {
                ap.add(college.getTCursos()[i].getEstudiante()[j].getApoderado().getNombre());
            }
        }
        return ap;
    }

   

    public void sepadados() {
        int i = 0, j = 0,k=0,l=0,m=0,n=0;
        ArrayList<String> nombresAB = new ArrayList();
        ArrayList<String> nombresCD = new ArrayList();
        ArrayList<String> nombresEI = new ArrayList();
        ArrayList<String> nombresJM = new ArrayList();
        ArrayList<String> nombresNR = new ArrayList();
        ArrayList<String> nombresSZ = new ArrayList();
        for (String s : ap) {
            if (s.substring(0, 1).equals("A") || s.substring(0, 1).equals("B")) {
                nombresAB.add(s);
                System.out.println("________________________________");
                System.out.println((i + 1) + " " + nombresAB.get(i));
                i++;
            }
            if (s.substring(0, 1).equals("C") || s.substring(0, 1).equals("D")) {
                nombresCD.add(s);
                System.out.println("________________________________");
                System.out.println((j + 1) + " " + nombresCD.get(j));
                j++;
            }
            if (s.substring(0, 1).equals("E")|| s.substring(0, 1).equals("F")|| 
                    s.substring(0, 1).equals("G") || s.substring(0, 1).equals("H")|| 
                    s.substring(0, 1).equals("I")) {
                nombresEI.add(s);
                System.out.println("________________________________");
                System.out.println((k + 1) + " " + nombresEI.get(k));
                k++;
            }
            if (s.substring(0, 1).equals("J") || s.substring(0, 1).equals("K")|| 
                    s.substring(0, 1).equals("L")|| s.substring(0, 1).equals("M")) {
                nombresJM.add(s);
                System.out.println("________________________________");
                System.out.println((l + 1) + " " + nombresJM.get(l));
                l++;
            }
            if (s.substring(0, 1).equals("N") || s.substring(0, 1).equals("O")|| 
                    s.substring(0, 1).equals("P")|| s.substring(0, 1).equals("Q")
                    ||s.substring(0, 1).equals("R")) {
                nombresNR.add(s);
                System.out.println("________________________________");
                System.out.println((m + 1) + " " + nombresNR.get(m));
                m++;
            }
            if (s.substring(0, 1).equals("S")|| 
                    s.substring(0, 1).equals("T")|| s.substring(0, 1).equals("U")
                    || s.substring(0, 1).equals("V")|| s.substring(0, 1).equals("W")
                    || s.substring(0, 1).equals("X")|| s.substring(0, 1).equals("Y")
                    || s.substring(0, 1).equals("Z")) {
                nombresSZ.add(s);
                System.out.println("________________________________");
                System.out.println((n+ 1) + " " + nombresSZ.get(n));
                n++;
            }

        }

    } public void imprimir() {
        int i = 0;
        for (String s : ap) {
            System.out.println("________________________________");
            System.out.println(i + " " + s);
            i++;
        }
    }
}
