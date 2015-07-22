package com.ventura.control.service.adm.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ventura.control.domain.adm.Company;
import com.ventura.control.repository.adm.CompanyDao;
import com.ventura.control.service.adm.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService{

	
	@Autowired
	private CompanyDao companyDao;
	
	
	public List<Company> listCompany() {		
		return companyDao.listCompany();
	}

}
