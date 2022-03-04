
package com.tarea3.domain;
import lombok.Data;

@Data
public class Videojuegos {
    String nombre;
    String genero;
    String empresa;
    String plataforma;
    String numjugadores;

    public Videojuegos() {
    }

    public Videojuegos(String nombre, String genero, String empresa, String plataforma, String numjugadores) {
        this.nombre = nombre;
        this.genero = genero;
        this.empresa = empresa;
        this.plataforma = plataforma;
        this.numjugadores = numjugadores;
    }
    
    
    

}
