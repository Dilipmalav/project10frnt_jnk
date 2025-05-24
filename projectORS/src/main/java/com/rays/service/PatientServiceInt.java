package com.rays.service;

import com.rays.common.BaseServiceInt;
import com.rays.common.UserContext;
import com.rays.dto.PatientDTO;

public interface PatientServiceInt extends BaseServiceInt<PatientDTO> {

	public PatientDTO findByName(String name, UserContext userContext);
}
