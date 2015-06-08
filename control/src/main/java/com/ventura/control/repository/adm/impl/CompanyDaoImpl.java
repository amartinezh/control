package com.ventura.control.repository.adm.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ventura.control.domain.adm.Company;
import com.ventura.control.repository.adm.CompanyDao;

@Repository
public class CompanyDaoImpl implements CompanyDao {

	@PersistenceContext
	private EntityManager em = null;

	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<Company> listCompany() {
		return em.createQuery("SELECT C FROM Company as C").getResultList();
	}

}
