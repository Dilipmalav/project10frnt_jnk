package com.rays.form;

import java.util.Date;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.InventoryDTO;
import com.rays.dto.PositionDTO;

public class PositionForm extends BaseForm {

	@Size(max = 20, message = "Enter only 20 characters")
	@NotBlank(message = "Please enter designation")
	private String designation;

	@NotNull(message = "Please enter requiredExperience")
	@DecimalMin(value = "0.1", inclusive = true, message = "Experience must be greater than 0")
	private Double requiredExperience;

	@NotNull(message = "Please enter opening date")
	private Date openingDate;

	@Size(max = 30, message = "Condition Name must be at most 30 characters")
	@NotBlank(message = "Please enter condition Name")
	@Pattern(regexp = "^[a-zA-Z0-9 ]*$", message = "Condition Name must not contain special characters")
	private String conditionName;

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Double getRequiredExperience() {
		return requiredExperience;
	}

	public void setRequiredExperience(Double requiredExperience) {
		this.requiredExperience = requiredExperience;
	}

	public Date getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(Date openingDate) {
		this.openingDate = openingDate;
	}

	public String getConditionName() {
		return conditionName;
	}

	public void setConditionName(String conditionName) {
		this.conditionName = conditionName;
	}

	public BaseDTO getDto() {

		PositionDTO dto = initDTO(new PositionDTO());

		dto.setDesignation(designation);
		dto.setRequiredExperience(requiredExperience);
		dto.setOpeningDate(openingDate);
		dto.setConditionName(conditionName);

		System.out.println("all data are done ");

		return dto;
	}

}
