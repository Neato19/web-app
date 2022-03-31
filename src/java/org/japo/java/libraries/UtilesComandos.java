/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.libraries;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.rmi.ServerException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.japo.java.bll.commands.ICommand;

/**
 *
 * @author Iván Martínez Sánchez - ivanmasan@outlook.com
 */
public class UtilesComandos {
    
    private static final String COMMAND_PKG = "org.japo.java.bll.commands";
    private static final String COMMAND_PRE = "Command";

    public static void procesar(
            ServletConfig config,
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, ServerException, IOException {

        String cmdName = request.getParameter("cmd");

        ICommand cmd = obtenerComando(cmdName);

        cmd.init(config, request, response);

        cmd.process();

    }

    private static ICommand obtenerComando(String cmdName)
            throws ServletException, ServerException {
        //Referencia Comando
        ICommand cmd;

        try {

            //Nombre Comando > Nombre Clase
            String cmdClassName = obtenerNombreComando(cmdName);

            //Nombre Clase > Objeto Class
            Class<?> cmdClass = Class.forName(cmdClassName);

            //Objeto Class > Constructor Clase
            Constructor<?> constructor = cmdClass.getConstructor();

            //Constructor > Intancia Clase
            cmd = (ICommand) constructor.newInstance();

        } catch (ClassNotFoundException | NoSuchMethodException
                | SecurityException | InstantiationException | IllegalAccessException
                | IllegalArgumentException | InvocationTargetException ex) {
            // Clase Indefinida | Desconocida
            throw new ServletException(ex.getMessage());
        }
        //Retorno: comando
        return cmd;
    }

    private static String obtenerNombreComando(String cmd) throws ServerException {
        // Subpaquete
        String sub;
        
        // Nombre Comando > Subpaquete
        if (cmd == null) {
            throw new ServerException("Comando NO especificado");
            
        } else if (cmd.equals("validation")) {
            sub = "admin";
        } else if (cmd.contains("-")) {
            sub = cmd.substring(0, cmd.lastIndexOf("-"));
            sub = sub.replace("-", ".");
        } else {
            sub = cmd;
        }
        
        // Comando Kebab-Case > Comando > Camel-Case
        cmd = UtilesFormato.cambiarKebab2Camel(cmd);
        
        // Retorno: Nombre Cualificado Clase
        return String.format("%s.%s.%s%s", COMMAND_PKG, sub, COMMAND_PRE, cmd);
    }

}
