package com.ventura.control.service.adm;

import java.util.List;

import com.ventura.control.domain.adm.TypeUser;

public interface TypeUserService {
	
	public void saveTypeUser(TypeUser typeuser);
	public List<TypeUser> listTypeUser();
	public TypeUser getTypeUser(int id);
	public void deleteTypeUser(int id);
	
}
