package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.common.UserContext;
import com.rays.dao.ProjectDAOInt;
import com.rays.dto.ProjectDTO;
import com.rays.dto.RoleDTO;


@Service
@Transactional
public class ProjectServiceImpl extends BaseServiceImpl<ProjectDTO, ProjectDAOInt> implements ProjectServiceInt{

	@Transactional(readOnly = true)
	public ProjectDTO findByName(String name, UserContext userContext) {
		return baseDao.findByUniqueKey("name", name, userContext);
	}
}
