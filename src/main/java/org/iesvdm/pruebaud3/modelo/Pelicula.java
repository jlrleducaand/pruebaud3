package org.iesvdm.pruebaud3.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pelicula {

    private int id;
    private String titulo;
    private String descripcion;
    private Date fecha_lanzamiento;
    private int id_idioma;
    private int duracion_alquiler;
    private double rental_rate;
    private int duracion;
    private double replacement_cost;
    private Date ultima_actualizacion;

}
