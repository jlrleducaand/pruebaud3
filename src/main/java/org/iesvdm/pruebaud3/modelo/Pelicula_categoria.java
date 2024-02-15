package org.iesvdm.pruebaud3.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
//Para generar un constructor con lombok con todos los args
@AllArgsConstructor
@NoArgsConstructor
public class Pelicula_categoria {

    private int id_categoria;
    private String nombre;
    private Date ultima_actualizacion;
}
