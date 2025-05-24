package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.ProjectDTO;
import com.rays.dto.RoleDTO;

@Repository
public class ProjectDAOImpl extends BaseDAOImpl<ProjectDTO> implements ProjectDAOInt {

	
	protected List<Predicate> getWhereClause(ProjectDTO dto, CriteriaBuilder builder, Root<ProjectDTO> qRoot) {
		// Create where conditions
		System.out.println("getwhereClause inside RoleDao Impl");
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getName())) {

			whereCondition.add(builder.like(qRoot.get("name"), dto.getName() + "%"));
		}
		
		if (!isEmptyString(dto.getDescription())) {

			whereCondition.add(builder.like(qRoot.get("description"), dto.getDescription() + "%"));
		}

		if (!isZeroNumber(dto.getId())) {

			whereCondition.add(builder.equal(qRoot.get("id"), dto.getId()));
		}

		return whereCondition;
	}


	@Override
	public Class<ProjectDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return ProjectDTO.class;
	}


	
}
