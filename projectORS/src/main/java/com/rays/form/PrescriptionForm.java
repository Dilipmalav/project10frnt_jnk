package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.PrescriptionDTO;

public class PrescriptionForm extends BaseForm {

	@Pattern(regexp = "^[a-zA-Z]+$", message = "Only alphabets are allowed")
	@NotEmpty(message = "please enter name")
	private String name;

	@NotEmpty(message = "please enter decease")
	private String decease;

	@NotNull(message = "please enter date")
	private Date date;
    
	@Pattern(regexp = "^[0-9]+$", message = "Only numbers are allowed")
	@NotNull(message = "please enter capacity")
	private Integer capacity;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDecease() {
		return decease;
	}

	public void setDecease(String decease) {
		this.decease = decease;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public BaseDTO getDto() {

		PrescriptionDTO dto = initDTO(new PrescriptionDTO());

		dto.setName(name);
		dto.setDecease(decease);
		dto.setDate(date);
		dto.setCapacity(capacity);

		System.out.println("all data are done ");

		return dto;
	}

}
