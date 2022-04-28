package org.japo.java.libraries;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.japo.java.dll.usuario.DLLUsuario;
import org.japo.java.entities.Usuario;

/**
 *
 * @author Iván Martínez Sánchez - ivanmasan@outlook.com
 */
public final class UtilesUsuarios {
        
        // Valores por Defecto
        public static final int DEF_ID = 0;
        public static final String DEF_USER = "Usuario Indefinido"; // 18 < 30
        public static final String DEF_PASS = "123456";
        public static final String DEF_AVATAR = "data:image/png;base64,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";
    
        // Expresiones Regulares ( Validación )
        public static final String REG_USER = "\\w{3,30}";
        public static final String REG_PASS = "\\w{3,30}";
        
            //
        public static final boolean validarId(int id) {
        
            return id >= DEF_ID;

        }
    
        public static boolean validarUser(String user) {

            return user.matches(REG_USER);
        
        }

        public static boolean validarPass(String pass) {
        
            return pass.matches(REG_PASS);
        
        }

        public static boolean validarAvatar(String avatar) {
        
            return UtilesBase64.validar(avatar);
        
        }

    public static String obtenerComandoVistaPrincipal(HttpServletRequest request) {
        
        // Salida
        String out;
        
        // Request > Sesion
        HttpSession sesion = request.getSession(false);
        
        // Sesion > Usuario
        Usuario usuario = (Usuario) sesion.getAttribute("usuario");
        
        // Discriminar Salida
        switch (usuario.getPerfil()) {
            case UtilesPerfiles.BASIC_CODE:
                out = "main/main-basic";
                break;
            case UtilesPerfiles.ADMIN_CODE:
                out = "main/main-admin";
                break;
            default:
                // Esto no debería de ocurrir
                out = "main/main-basic";
        }
        
        // Retorno Salida
        return out;
    }

    public static Usuario obtenerUsuarioRequest(ServletConfig config, HttpServletRequest request) {
        
        // Capa Acceso a Datos - Usuario
        DLLUsuario dllUsuario = new DLLUsuario(config);
        
        // Request > Nombre de Usuario
        String user = request.getParameter("user");
        
        // Base de Datos + User > Usuario
        Usuario usuario = dllUsuario.consultar(user);
        
        // Request > Password
        String pass = request.getParameter("pass");
        
        // Validar Password
        if (usuario != null && !usuario.getPass().equals(pass)) {
            usuario = null;
        }
        
        // Retorno: Usuario
        return usuario;
    }

    public static HttpSession reiniciarSesion(ServletConfig config, HttpServletRequest request) {
        
        // Request > Obtener Sesion
        HttpSession sesion = request.getSession(false);
        
        // Verificar Existencia Sesión
        if (sesion != null) {
            sesion.invalidate();
        } 
        
        // Crear Sesión 
        sesion = request.getSession();
        
        // Config > Lapso
        int lapso = UtilesServlets.obtenerLapsoInactividad(config);
        
        // Tiempo Maximo de Sesion Inactiva
        sesion.setMaxInactiveInterval(lapso);
        
        // Retorno: Sesión
        return sesion;
    }
    
}
