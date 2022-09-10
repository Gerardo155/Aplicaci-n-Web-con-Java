/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author GERARD
 */
public class Alumno {
    
    private String Nombre;
    private String Apellido;
    private String Direccion;
    private String Correo;
    private String Telefono;
    private String Codigo;

    
    
    
      public Alumno(String nombre, String apellido, String direccion, String correo, String telefono, String codigo){
   
   
       this.Nombre=nombre;  
       this.Apellido=apellido;  
       this.Direccion=direccion;
       this.Correo=correo;
       this.Telefono=telefono;
       this.Codigo=codigo; 
               
   } 

  
 
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }
      
    
}
