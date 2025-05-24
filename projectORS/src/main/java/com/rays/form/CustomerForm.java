package com.rays.form;

import java.util.Date;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.CustomerDTO;
import com.rays.dto.InventoryDTO;

public class CustomerForm extends BaseForm {

	@Pattern(regexp = "^[a-zA-Z]+$", message = "Only alphabets are allowed")
	@NotEmpty(message = "please enter client name")
	private String clientName;

	@Pattern(regexp = "^[a-zA-Z]+$", message = "Only alphabets are allowed")
	@NotEmpty(message = "please enter location")
	private String location;

	@Digits(integer = 10, fraction = 0, message = "Only digits are allowed")
	@NotNull(message = "Please enter contactNumber")
	private Long contactNumber;

	@NotEmpty(message = "please enter importance")
	private String importance;

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getImportance() {
		return importance;
	}

	public void setImportance(String importance) {
		this.importance = importance;
	}

	public BaseDTO getDto() {

		CustomerDTO dto = initDTO(new CustomerDTO());

		dto.setClientName(clientName);
		dto.setLocation(location);
		dto.setContactNumber(contactNumber);
		dto.setImportance(importance);

		System.out.println("all data are done ");

		return dto;
	}
}
