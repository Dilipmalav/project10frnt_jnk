package com.rays.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.common.UserContext;
import com.rays.dao.PrescriptionDAOInt;
import com.rays.dto.PrescriptionDTO;


@Service
@Transactional
public class PrescriptionServiceImpl extends BaseServiceImpl<PrescriptionDTO, PrescriptionDAOInt> implements PrescriptionServiceInt{

	@Autowired
	PrescriptionDAOInt PrescriptionDAO;
	
	 @Transactional(readOnly = true)
	public PrescriptionDTO findByName(String name, UserContext userContext) {
		return baseDao.findByUniqueKey("name", name, userContext);
	} 
	 
 }

