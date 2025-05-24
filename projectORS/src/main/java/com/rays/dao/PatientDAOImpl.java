package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.InventoryDTO;
import com.rays.dto.PatientDTO;

@Repository
public class PatientDAOImpl extends BaseDAOImpl<PatientDTO> implements PatientDAOInt{

	@Override
	protected List<Predicate> getWhereClause(PatientDTO dto, CriteriaBuilder builder, Root<PatientDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getName())) {

			whereCondition.add(builder.like(qRoot.get("name"), dto.getName() + "%"));
		}

		if (isNotNull(dto.getDateOfVisit())) {

			whereCondition.add(builder.equal(qRoot.get("dateOfVisit"), dto.getDateOfVisit()));
		}

		if (!isEmptyString(dto.getDecease())) {

			whereCondition.add(builder.like(qRoot.get("decease"), dto.getDecease() + "%"));
		}

		if (!isZeroNumber(dto.getMobile())) {

			whereCondition.add(builder.equal(qRoot.get("mobile"), dto.getMobile()));
		}

		return whereCondition;
	}


	@Override
	public Class<PatientDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return PatientDTO.class;
	}

}
