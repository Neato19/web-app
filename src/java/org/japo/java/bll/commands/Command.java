package org.japo.java.bll.commands;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.japo.java.entities.Usuario;

/**
 *
 * @author Iván Martínez Sánchez - ivanmasan@outlook.com
 */
public abstract class Command implements ICommand {

    protected ServletConfig config;
    protected HttpServletRequest request;
    protected HttpServletResponse response;

    @Override
    public void init(ServletConfig config, HttpServletRequest request, HttpServletResponse response) {

        this.config = config;
        this.request = request;
        this.response = response;

    }

    protected void forward(String out) throws IOException, ServletException {

        if (out.startsWith("controller")) {

            // Eliminar Prefijo
            out = out.replace("controller", "");

            // Redirección de Comando
            response.sendRedirect(out);

        } else {

            // Redirección de Vista
            // Config > Ruta Base Vistas
            String ruta = config.getServletContext().getInitParameter("ruta-vistas");

            // Ruta Base + Salida > Ruta Vista
            out = String.format("%s/%s.jsp", ruta, out);

            // Request + Vista > Despachador
            RequestDispatcher dispatcher = request.getRequestDispatcher(out);

            // Despachador > Redirección
            dispatcher.forward(request, response);

        }

    }

    protected boolean validarSesion(HttpServletRequest request) {
        
        // Semáforo Validación
        boolean checkOK = false;
        
        // Request > Sesion
        HttpSession sesion = request.getSession(false);
        
        // Validación
        if (sesion != null) {
            Usuario usuario = (Usuario) sesion.getAttribute("usuario");
            
            if (usuario != null) {
                // Se deberia comprobar la existencia del usuario de la sesión
                // en la base de datos.
                checkOK = true;
                
            }
        }
        
        return checkOK;
    }

}
