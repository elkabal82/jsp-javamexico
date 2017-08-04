/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import beans.Datos;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author edgardo
 */
@WebServlet(name = "ServletControlador", urlPatterns = {"/ServletControlador"})
public class ServletControlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        Datos datos = new Datos();
        //Si lo que recibimos de la pag. index en el campo nombre esta vacio lo mandamos a la pag.error
        //de lo contrario guardamos en datos
        if(request.getParameter("nombre").equals("")){
            request.getRequestDispatcher("error.jsp").forward(request, response);  
        }else{
            datos.setNombre(request.getParameter("nombre"));
        }
        
        //Si opciones no tienen nada o es mayor de una seleccion va la a pag. error
        //de lo contrario gurdamos la info en datos
        if(request.getParameterValues("opciones") == null || request.getParameterValues("opciones").length > 1){
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }else{
            
            datos.setOpciones(request.getParameterValues("opciones"));
        }
        
       request.getRequestDispatcher("resultados.jsp").forward(request, response);
        
        /*
        //Validamos los datos
        if( datos.getNombre().equals("")){
            request.getRequestDispatcher("error.jsp").forward(request, response);
//Si el usuario mete mas de un valor o no mete ninguno, ERROR :)
        }else if( datos.getOpciones().length > 1){
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
        request.getRequestDispatcher("resultados.jsp").forward(request, response);
    */    
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
