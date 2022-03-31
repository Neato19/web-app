package org.japo.java.libraries;

/**
 *
 * @author Iván Martínez Sánchez - ivanmasan@outlook.com
 */
public final class UtilesFormato {

    public static final String cambiarKebab2Camel(String str) {
        // String > String[]
        String[] items = str.split("-");
        
        // Buffer String
        StringBuilder sb = new StringBuilder();
        
        //Bucle 
        for (String item : items) {
            sb.append(capitalizar(item));
    }
        
        //Retorno Notación Camel-Case
        return sb.toString();
    }

    public static final String capitalizar(String item) {
        if (item != null) {
            // Item > Inicial Mayúscula
            char head = Character.toUpperCase(item.charAt(0));
            
            // Item > Resto Cadena Minúscula
            String tail = item.substring(1).toLowerCase();
            
            // Head + tail
            item = head + tail;
        }
        
        // Retorno: item
        return item;
    }
        

    private UtilesFormato() {
    }
    
}
