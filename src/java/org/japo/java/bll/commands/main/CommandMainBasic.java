/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.bll.commands.main;

import org.japo.java.bll.commands.detail.*;
import java.io.IOException;
import javax.servlet.ServletException;
import org.japo.java.bll.commands.Command;

/**
 *
 * @author Iván Martínez Sánchez - ivanmasan@outlook.com
 */
public class CommandMainBasic extends Command {

    @Override
    public void process() throws ServletException, IOException {
        
        // Salida
        String out = "main/main-basic";
        
        // Redirección
        forward(out);
        
    }
    
}
