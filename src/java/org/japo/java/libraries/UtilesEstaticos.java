/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.libraries;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Iván Martínez Sánchez - ivanmasan@outlook.com
 */
public final class UtilesEstaticos {

    private UtilesEstaticos() {
    }

    public static void procesar(ServletConfig config, HttpServletRequest request,
            HttpServletResponse response) throws IOException {

        File fichero = localizar(request);
//        File fichero = localizarRecursoPrivado(request);

        servir(fichero, response);
    }

    private static File localizar(HttpServletRequest request) {
        String base = "/WEB-INF/static";
        String ruta = request.getPathTranslated().replace("\\", "/");
        String peticion = request.getPathInfo();
        String servicio = base + peticion;

        ruta = ruta.replace(peticion, servicio);

        return new File(ruta);
    }

    private static File localizarRecursoPrivado(HttpServletRequest request) {
        String base = "/WEB-INF/static";

        HttpSession sesion = request.getSession();

        String id = sesion.getId();

        String ruta = request.getPathTranslated().replace("\\", "/");

        if (ruta.contains(id)) {
            String peticion = request.getPathInfo();
            
            String servicio = base + peticion.replace("/" + id, "");

            ruta = ruta.replace(peticion, servicio);
        } else {
            ruta = null;
        }

        return new File(ruta);
    }

    private static void servir(File fichero, HttpServletResponse response)
            throws IOException {

        byte[] buffer = new byte[(int) fichero.length()];

        try (FileInputStream origen = new FileInputStream(fichero);
                ServletOutputStream destino = response.getOutputStream()) {

            //Origen > Buffer
            origen.read(buffer);

            //Buffer > Destino
            destino.write(buffer);
        }
    }
}
