package com.ventura.control.repository.control.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ventura.control.domain.adm.TypeUser;
import com.ventura.control.domain.control.Dependencia;
import com.ventura.control.repository.control.RepositorioDao;

@Repository
public class RepositorioDaoImp implements RepositorioDao {

	@PersistenceContext
	private EntityManager em = null;

	public void setEm(EntityManager em) {
		this.em = em;
	}

	public EntityManager getEm() {
		return em;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void agregar(Object obj) {
		em.persist(obj);
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void actualizar(Object obj) {
		em.merge(obj);
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void borrar(Object obj) {
		em.remove(obj);
	}

	@SuppressWarnings("unchecked")
	public List<Object[]> listar(String sql) {
		return em.createQuery(sql).getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public Query listarObjeto(String sql) {
		return em.createQuery(sql);
	}
	
	
	@Transactional(propagation = Propagation.REQUIRED)
	public Object getElemento(Object obj, int id) {
		return em.find(obj.getClass(), id);	
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public Object getElemento(Object obj, String id) {
		return em.find(obj.getClass(), id);	
	}
}
