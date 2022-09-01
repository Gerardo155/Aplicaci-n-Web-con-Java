/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import Clases.Alumno;
import Clases.AlumnoController;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author GERARD
 */
@WebServlet(urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {

    Alumno alumno;
    AlumnoController registroAlumno;
    Alumno[] alumnoRegistrado;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            
            
            String nombre = request.getParameter("nombre");
             String apellido = request.getParameter("apellido");
              String direccion = request.getParameter("direccion");
               String correo = request.getParameter("correo");
                String telefono = request.getParameter("telefono");
                 String codigo = request.getParameter("codigo");
                
            
            alumno = new Alumno(
            
             request.getParameter("nombre"),
             request.getParameter("apellido"),
             request.getParameter("direccion"),
             request.getParameter("correo"),
             request.getParameter("telefono"),
             request.getParameter("codigo")
            );
            
            
            if(registroAlumno==null){
                registroAlumno= new AlumnoController();
            
            }
            
            
            registroAlumno.guardarAlumno(alumno);
                alumnoRegistrado = registroAlumno.getAlumno();
                
                
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Datos del alumno</title>"); 
            out.println("<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css' integrity='sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N' crossorigin='anonymous'>");
            out.println("<script src='https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js' integrity='sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct' crossorigin='anonymous'></script>");          
            out.println("</head>");
            out.println("<body>");
            
              out.println("<h3>"+nombre+"</h3>"); 
              out.println("<h3>"+apellido+"</h3>"); 
              out.println("<h3>"+direccion+"</h3>"); 
              out.println("<h3>"+correo+"</h3>"); 
              out.println("<h3>"+telefono+"</h3>"); 
              out.println("<h3>"+codigo+"</h3>"); 
              
            out.println("<div class='container'>");      
            out.println("<br><h1>Datos del Alumno</h1><br>"); 
            out.println("<form name='nombreForm'>");
            out.println("<div class='container-lg d-flex'> <a href='http://localhost:8090/Aplicaci_n_Web_con_Java/index.html' class=\"btn btn-success ml-auto\">Registrar Nuevo</a></div><br>");
            
            out.println("<table class=\"table table-hover table-striped\">"); 
            out.println("<thead><tr> <th scope=\"col\">NOMBRE</th> <th scope=\"col\">APELLIDO</th>\n" +
                                "<th scope=\"col\">DIRECCION</th> <th scope=\"col\">CORREO</th>\n" +
                                "<th scope=\"col\">TELEFONO</th> <th scope=\"col\">CODIGO</th>\n" +
                                "<th scope=\"col\">ACCION</th> </tr></thead>");  
            
          
                    
            
            
            out.println("<tbody>");
            
            for (int i = 0; i< alumnoRegistrado.length; i++){
                if(!alumnoRegistrado[i].getCodigo().isEmpty()){
                    out.println("<tr><td>" + alumnoRegistrado[i].getNombre() +"</td>");
                    out.println("<td>" + alumnoRegistrado[i].getApellido() +"</td>");
                    out.println("<td>" + alumnoRegistrado[i].getDireccion() +"</td>");
                    out.println("<td>" + alumnoRegistrado[i].getCorreo() +"</td>");
                    out.println("<td>" + alumnoRegistrado[i].getTelefono() +"</td>");
                    out.println("<td>" + alumnoRegistrado[i].getCodigo() +"</td>");
                    
                    out.println("<td>" + "<button type=\"button\" class=\"btn btn-warning\"></i>Editar</button>" 
                                       + "<button type=\"button\" class=\"btn btn-danger\"></i>Editar</button>"
                                       + "</td></tr>");
                            
                           
                     
                 
                    
            }
                   
            }
            
            
            
                   
            
                        out.println("</tbody></table>"); 
                        out.println("</div>");
                        out.println("</form>");
            
            
            
            
            
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
