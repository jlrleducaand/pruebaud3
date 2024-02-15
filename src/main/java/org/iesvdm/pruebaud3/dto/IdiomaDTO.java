package org.iesvdm.pruebaud3.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IdiomaDTO {

	private int id_idiomas;
	private String nombre;
	private Date ultima_actualizacion;

}
