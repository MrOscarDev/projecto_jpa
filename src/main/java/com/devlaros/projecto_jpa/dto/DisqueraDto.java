/**
 * 
 */
package com.devlaros.projecto_jpa.dto;

import java.util.List;

import com.devlaros.projecto_jpa.entity.Disquera;

/**
 * @author DevLar
 *
 */
public interface DisqueraDto {
	void guardar(Disquera disquera);
	void actualizar(Disquera disquera);
	void borrar(Disquera disquera);
	List<Disquera> consultar();
	
	Disquera consultarId(long id);

}
