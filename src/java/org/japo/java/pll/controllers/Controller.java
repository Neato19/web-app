/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.pll.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.japo.java.libraries.UtilesComandos;
import org.japo.java.libraries.UtilesEstaticos;
import org.japo.java.libraries.UtilesServicios;

/**
 *
 * @author Iván Martínez Sánchez -  ivanmasan@outlook.com
 */
@WebServlet(name = "Controller", urlPatterns = {"", "/public/*"})
public class Controller extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
//        Configuración App
        ServletConfig config = getServletConfig();
        
//        System.out.println("Ruta de Contexto ....: " + request.getContextPath());
//        System.out.println("Ruta del Servlet ....: " + request.getPathInfo());
//        System.out.println("Ruta Local ..... ....: " + request.getPathTranslated());
//        System.out.println("Cadena de Peticion ..: " + request.getQueryString());
//        System.out.println("Recurso .............: " + request.getServletPath());

        if (request.getPathInfo().equals("/")) {
            System.out.println("Primera Puerta");
      
            if (request.getParameter("svc") != null) {
                UtilesServicios.procesar(config, request, response);
            } else if (request.getParameter("cmd") != null) {
                UtilesComandos.procesar(config, request, response);
            } else {
                
                // Página Predeterminada
                response.sendRedirect("?cmd=visita-landing");
                
            }
            
//                // Request > Comando
//                String cmd = request.getParameter("cmd");
//            
//                // Salida
//                String out;
//            
//                // Discriminar Comando
//                if (cmd == null) {
////                  out = "?cmd=langing";
//                    out = "WEB-INF/views/visita/visita-landing.jsp";
//                
//                } else if (cmd.equals("login")) {
////                  out = "?cmd=login";
//                    out = "WEB-INF/views/usuario/usuario-login.jsp";
//                
//                } else if (cmd.equals("logout")) {
////                  out = "?cmd=logout";
//                    out = "WEB-INF/views/usuario/usuario-logout.jsp";
//                
//                } else if (cmd.equals("main")) {
////                  out = "?cmd=main";
//                    out = "WEB-INF/views/main/main-usuario.jsp";
//                
//                } else {
//                    out = "WEB-INF/views/message/recurso-inaccesible.jsp";
//                }
//            
//                // Redirección
//                RequestDispatcher despachador = request.getRequestDispatcher(out);
//            
//                // Lanzar Vista
//                despachador.forward(request, response);
            
        } else {
            System.out.println("Segunda Puerta");
            
//            UtilesEstaticos.procesar((HttpServletRequest) config, request, response);
            UtilesEstaticos.procesar(request, response);
            
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
