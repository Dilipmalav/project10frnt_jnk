package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_POSITION")
public class PositionDTO extends BaseDTO {

	@Column(name = "DESIGNATION", length = 20)
	private String designation;

	@Column(name = "OPENING_DATE")
	private Date openingDate;

	@Column(name = "REQUIRED_EXPERIENCE")
	private Double requiredExperience;

	@Column(name = "CONDITION_NAME", length = 20)
	private String conditionName;

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Date getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(Date openingDate) {
		this.openingDate = openingDate;
	}

	public Double getRequiredExperience() {
		return requiredExperience;
	}

	public void setRequiredExperience(Double requiredExperience) {
		this.requiredExperience = requiredExperience;
	}


	public String getKey() {
		return conditionName;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return conditionName;
	}

	public String getConditionName() {
		return conditionName;
	}

	public void setConditionName(String conditionName) {
		this.conditionName = conditionName;
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "designation";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return designation;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return designation;
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("designation", "asc");

		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("conditionName", conditionName);
		return map;
	}

}
