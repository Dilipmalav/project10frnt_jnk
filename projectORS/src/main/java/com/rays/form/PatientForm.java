package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.InventoryDTO;
import com.rays.dto.PatientDTO;

public class PatientForm extends BaseForm {

	@NotEmpty(message = "please enter name")
	private String name;

	@NotNull(message = "please enter dateOfVisit")
	private Date dateOfVisit;
    
	@NotNull(message = "please enter mobile")
	private Long mobile;

	@NotEmpty(message = "please enter decease")
	private String decease;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfVisit() {
		return dateOfVisit;
	}

	public void setDateOfVisit(Date dateOfVisit) {
		this.dateOfVisit = dateOfVisit;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getDecease() {
		return decease;
	}

	public void setDecease(String decease) {
		this.decease = decease;
	}

	public BaseDTO getDto() {

		PatientDTO dto = initDTO(new PatientDTO());

		dto.setName(name);
		dto.setDateOfVisit(dateOfVisit);
		dto.setMobile(mobile);
		dto.setDecease(decease);

		System.out.println("all data are done ");

		return dto;
	}
}
