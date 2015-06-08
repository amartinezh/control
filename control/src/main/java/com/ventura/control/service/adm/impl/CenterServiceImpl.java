package com.ventura.control.service.adm.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ventura.control.domain.adm.Center;
import com.ventura.control.repository.adm.CenterDao;
import com.ventura.control.service.adm.CenterService;

@Service
public class CenterServiceImpl implements CenterService {

	@Autowired
	private CenterDao centerDao;
	
	public List<Center> listCenter() {
		return centerDao.listCenter();
	}
	
}
