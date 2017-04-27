/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generar;

import java.util.Random;

/**
 *genera los nombres aleatorios para las personas del curso
 * @author Ignacio
 */
public class GetNombresRut {
    
    private int ale1;
    private int ale2;
    //int ale3;
    Random r = new Random();
    
    //24
    String [] nombresAlumno ={"Jucliouco","Emiliano","Mariano","Maximiliano","Jorge",
        "Maria","Mario","Jessica","Inés","Marco","Fabio","Flabio","Johannes","Logan",
    "Manueh","Gabriel","Carlos","Carl","Bryan","Jack","Maickel","Jamna","Lucy","Javla"};
    
    //24
    String [] apellidos={"Catalán","Zambrotta","Salvatore","Silva","Danielez","Curvanez"
    ,"Morenazo","Schwansteigger","Papasthadopoulos","Fischio","Esparza","Palma","McDonals"
    ,"Lumbico","Angulo","Beron","Madrid","Balentines","Jacdaniels","Maxx","Heinz"
    ,"Burgos","Lee","Xun"};
    
    //24
    String [] nombreApoderado={"Marcos","Raul","Daniel","Roberto","Romero","Alberto"
    ,"Pablo","Juan","Lucas","Pedro","Jannette","Mariana","Denisse","Vanessa","Ignacio"
    ,"Carlos","Patricio","Cristiano","Lionel","Alexis","Alex","Felipe","Lucila","Manuela"};
    
    /**
     * 
     * @return retorna el nombre de algun alumno aleatorio 
     */
    public String nomAlumno (){
        ale1=r.nextInt(23);
        ale2=r.nextInt(23);
        return nombresAlumno[ale1]+" "+apellidos[ale2];
    }
    
    /**
     * @return retorna el nombre del apoderado aleatorio 
     */
    public String nomApoderado(){
       ale1=r.nextInt(23);
       ale2=r.nextInt(23);
       return nombreApoderado[ale1]+" "+apellidos[ale2];
    }
    
    /**
     * 
     * @return  re torna los nombres de los profesores
     */
    public String [] nomProfesor(){
        String [] NombresProfesor={"Federico Balmaceda","María Daniels",
            "Alberto Hebrews","Juan Sennheiser","Hugo Zambrotta","Manuelo Black",
            "Jonathan Rojo","Pedro Assis","Keblar Dulcez","Pablo Consuelo",
            "Karen Ferrada","Daniela Montenegro","Jennifer Schuherz","Jorge Joyland",
            "Macarena Salvatierra","John Paul"};
        return NombresProfesor;
    }
    
    /**
     * 
     * @return crea un rut random que sea usado en los otros métodos
     */
    public String rutRandom(){
        ale1=r.nextInt(899)+100;
        return String.valueOf(ale1);
    }
    
    
}
