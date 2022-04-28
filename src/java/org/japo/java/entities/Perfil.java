/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.entities;

import org.japo.java.libraries.UtilesPerfiles;

/**
 *
 * @author Iván Martínez Sánchez - ivanmasan@outlook.com
 */
public final class Perfil {
    
    // CAMPOS
    private int id;
    private String nombre;
    private String info;

    // Constructores
    public Perfil() {
        this.id = UtilesPerfiles.DEF_ID;
        this.nombre = UtilesPerfiles.DEF_NOMBRE;
        this.info = UtilesPerfiles.DEF_INFO;
    }
    
    public Perfil(int id, String nombre, String info) {
        
        // Validación ID
        if (validarID()) {
            this.id = id;
        } else {
            this.id = UtilesPerfiles.DEF_ID;
        }
        
        // Validación Nombre
        if (validarNombre()) {
            this.nombre = nombre;
        } else {
            this.nombre = UtilesPerfiles.DEF_NOMBRE;
        }
        
        // Validación Info
        if (validarInfo()) {
            this.info = info;
        } else {
            this.info = UtilesPerfiles.DEF_INFO;
        }
        
    }

    
    // Campos Encapsulados
    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (validarID()) {
            this.id = id;
        } 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (validarNombre()) {
            this.nombre = nombre;
        }
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        if (validarInfo()) {
            this.info = info;
        }
    } 

    
    // Validación
    private boolean validarID() {
        return UtilesPerfiles.validarId(id);
    }

    private boolean validarNombre() {
        return UtilesPerfiles.validarNombre(nombre);
    }

    private boolean validarInfo() {
        return UtilesPerfiles.validarInfo(info);
    }
    
}
