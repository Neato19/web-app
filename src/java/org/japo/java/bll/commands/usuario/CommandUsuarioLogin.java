/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.bll.commands.usuario;

import org.japo.java.bll.commands.visita.*;
import java.io.IOException;
import javax.servlet.ServletException;
import org.japo.java.bll.commands.Command;
import org.japo.java.dll.usuario.DLLUsuario;
import org.japo.java.entities.Usuario;

/**
 *
 * @author Iván Martínez Sánchez -  ivanmasan@outlook.com
 */
public class CommandUsuarioLogin extends Command {

    @Override
    public void process() throws ServletException, IOException {
        
        // Salida
        String out = "usuario/usuario-login";
        
        // Operación
        String op = request.getParameter("op");
        
        // Discriminación de Operación
        if (op == null) {
          
            // Lanzar Formulario
            
        } else if (op.equals("captura")) {
            
            // Lanzar Formulario
            
        } else if (op.equals("proceso")) {
            
            // Procesar Formulario
            
            // Obtener Campos Formulario
            String user = request.getParameter("user");
            
            // Capa de Acceso a Datos
            DLLUsuario dllUsuario = new DLLUsuario();
            
            Usuario usuario = dllUsuario.consultar(user);
            
            // Procesar Formulario
            out = "message/credencial-correcta";
            
        } else {
            
            // Lanzar Formulario
            
        }
        
        // Redirección
        forward(out);
        
    }
    
}
