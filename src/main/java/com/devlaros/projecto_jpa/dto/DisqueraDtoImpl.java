/**
 * 
 */
package com.devlaros.projecto_jpa.dto;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.devlaros.projecto_jpa.entity.Disquera;

/**
 * @author DevLar
 *
 */
public class DisqueraDtoImpl implements DisqueraDto {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnit");
	@Override
	public void guardar(Disquera disquera) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et =em.getTransaction();
		et.begin();
		
		try {
			em.persist(disquera);
			et.commit();
		} catch (Exception e) {
			if(et != null) {
				et.rollback();
				e.printStackTrace();
			}
		}finally {
			em.close();
		}

	}

	@Override
	public void actualizar(Disquera disquera) {
		// TODO Auto-generated method stub

	}

	@Override
	public void borrar(Disquera disquera) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Disquera> consultar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Disquera consultarId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
