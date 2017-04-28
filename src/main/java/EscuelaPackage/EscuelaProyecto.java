/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EscuelaPackage;

import EscuelaVisual.ApoderadosColegioVisual;
import EscuelaVisual.Configuracion;
import EscuelaVisual.IngresoDatos.IngPlanificaciones;
import EscuelaVisual.SelectProfesor;
import Generar.GenerarCursos;
import Generar.GuardarXML;
import java.io.IOException;
import javax.xml.bind.JAXBException;

/**
 * @version 1.9.29
 * @author Ignacio Esparza
 */
public class EscuelaProyecto {

    /**
     * @param args the command line arguments
     * @throws javax.xml.bind.JAXBException
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws JAXBException, IOException {

//        GuardarXML g = new GuardarXML();
//        g.generarCursos();
        //Colegio col = g.cargar();
        // g.guardar(col);
//        SelectProfesor sp = new SelectProfesor();
//        sp.setVisible(true);

        ApoderadosColegioVisual a = new ApoderadosColegioVisual();
        a.setVisible(true);
    }
}
