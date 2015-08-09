package com.ventura.control.repository.control;

import java.util.List;


public interface RepositorioDao {
	
	public void agregar(Object obj);
	public List<Object[]> listar(String sql);
}
