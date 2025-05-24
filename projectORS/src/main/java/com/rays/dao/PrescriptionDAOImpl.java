package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.InventoryDTO;
import com.rays.dto.PrescriptionDTO;

@Repository
public class PrescriptionDAOImpl extends BaseDAOImpl<PrescriptionDTO> implements PrescriptionDAOInt {

	@Override
	protected List<Predicate> getWhereClause(PrescriptionDTO dto, CriteriaBuilder builder,
			Root<PrescriptionDTO> qRoot) {
		
		List<Predicate> whereCondition = new ArrayList<Predicate>();
		
		if (!isEmptyString(dto.getName())) {

			whereCondition.add(builder.like(qRoot.get("name"), dto.getName() + "%"));
		}

		if (isNotNull(dto.getDate())) {

			whereCondition.add(builder.equal(qRoot.get("date"), dto.getDate()));
		}

		if (!isEmptyString(dto.getDecease())) {

			whereCondition.add(builder.like(qRoot.get("decease"), dto.getDecease() + "%"));
		}

		 if (dto.getCapacity() != null) {
		        whereCondition.add(builder.equal(qRoot.get("capacity"), dto.getCapacity()));
		    
		    }
		return whereCondition;
	}

	@Override
	public Class<PrescriptionDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return PrescriptionDTO.class;
	}

}
