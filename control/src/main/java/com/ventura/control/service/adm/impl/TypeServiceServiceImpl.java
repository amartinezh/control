package com.ventura.control.service.adm.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ventura.control.domain.adm.TypeUser;
import com.ventura.control.repository.adm.TypeUserDao;
import com.ventura.control.service.adm.TypeUserService;

@Service
public class TypeServiceServiceImpl implements TypeUserService{

	@Autowired
	private TypeUserDao typeuserdao;

	@Transactional
	public void saveTypeUser(TypeUser typeuser) {
		typeuserdao.saveTypeUser(typeuser);
	}

	@Transactional
	public void deleteTypeUser(int id) {
		typeuserdao.deleteTypeUser(id);
	}

	@Transactional(readOnly = true)
	public TypeUser getTypeUser(int id) {
		return typeuserdao.getTypeUser(id);
	}
	
	@Transactional(readOnly = true)
	public List<TypeUser> listTypeUser() {
		return typeuserdao.listTypeUser();
	}
	
}
