/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package Clases;

import static java.awt.AWTEventMulticaster.remove;
import static java.nio.file.Files.delete;

/**
 *
 * @author GERARD
 */
public class AlumnoController {
    
    Alumno[] tablaAlumno;
    int indiceArray;
    

public AlumnoController(){

    this.tablaAlumno= new Alumno[100];
    this.indiceArray=0;
    
}

public void guardarAlumno(Alumno alumno){
    this.tablaAlumno[indiceArray]=alumno;
    this.indiceArray= this.indiceArray +1;

}
    

public Alumno[] getAlumno(){
return this.tablaAlumno;

}


 public void alumnoEliminar(Alumno alumno){
 
          this.tablaAlumno[indiceArray]=alumno;
          this.indiceArray=this.indiceArray +1;
          
          alumno=null;
          
          getAlumno();
            
            
            }
 
 
 }



