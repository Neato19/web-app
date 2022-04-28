/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.libraries;

/**
 *
 * @author Iván Martínez Sánchez - ivanmasan@outlook.com
 */
public final class UtilesFormato {

    private UtilesFormato() {
        
    }
    
    public final static String cambiarKebab2Camel(String str) {
        
        // String > String[]
        String[] items = str.split("-");
        
        // Buffer String
        StringBuilder sb = new StringBuilder();
        
        // Bucle
        for (String item : items) {
            sb.append(capitalizar(item));
        }
        
        // Retorno: Notación Camel-Case
        return sb.toString();
    }
    
    public static final String capitalizar(String item) {
        
        if (item != null) {
            
            // Item > Inicial Mayúscula
            char head = Character.toUpperCase(item.charAt(0));
        
            // Item > Resto Cadena Minúscula
            String tail = item.substring(1).toLowerCase();
            
            // Head + Tail
            item = head + tail;
        }
        
        // Retorno: Item
        return item;
    }
    
}
