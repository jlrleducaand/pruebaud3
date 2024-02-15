package org.iesvdm.pruebaud3.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
//La anotación @Data de lombok proporcionará el código de: 
//getters/setters, toString, equals y hashCode
//propio de los objetos POJOS o tipo Beans

@Data
//Para generar un constructor con lombok con todos los args
@AllArgsConstructor
@NoArgsConstructor

public class CategoriaDTO {
	
	private int id_categoria;
	private String nombre;
	private Date ultima_actualizacion;

}
