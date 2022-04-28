/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.bll.commands.detail;

import java.io.IOException;
import javax.servlet.ServletException;
import org.japo.java.bll.commands.Command;

/**
 *
 * @author Iván Martínez Sánchez - ivanmasan@outlook.com
 */
public class CommandDetailCadillac extends Command {

    @Override
    public void process() throws ServletException, IOException {
        
        // Salida
        String out = "detail/detail-cadillac";
        
        // Redirección
        forward(out);
        
    }
    
}
