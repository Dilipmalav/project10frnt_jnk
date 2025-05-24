package com.rays.service;

import com.rays.common.BaseServiceInt;
import com.rays.common.UserContext;
import com.rays.dto.InventoryDTO;
import com.rays.dto.PrescriptionDTO;


public interface PrescriptionServiceInt extends BaseServiceInt<PrescriptionDTO> {

	public PrescriptionDTO findByName(String name, UserContext userContext);
}
