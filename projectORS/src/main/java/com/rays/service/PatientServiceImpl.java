package com.rays.service;

import java.util.List;
import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.rays.common.BaseServiceImpl;
import com.rays.common.UserContext;
import com.rays.dao.PatientDAOInt;
import com.rays.dto.PatientDTO;

@Service
@Transactional
public class PatientServiceImpl extends BaseServiceImpl<PatientDTO, PatientDAOInt> implements PatientServiceInt{

	@Autowired
	   PatientDAOInt PatientDAO;
	
	 @Transactional(readOnly = true)
	public PatientDTO findByName(String name, UserContext userContext) {
		return baseDao.findByUniqueKey("name", name, userContext);
	}

	

}
