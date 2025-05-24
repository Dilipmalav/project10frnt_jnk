package com.rays.form;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.InventoryDTO;
import com.rays.dto.ProjectDTO;

public class InventoryForm extends BaseForm {

	@Pattern(regexp = "^[a-zA-Z]+$", message = "Only alphabets are allowed")
	@NotEmpty(message = "please enter supplier name")
	private String supplierName;

	@NotNull(message = "please enter lastUpdatedDate")
	private Date lastUpdatedDate;
    
	
	@NotNull(message = "please enter quantity")
	private Long quantity;

	@NotEmpty(message = "please enter product")
	private String product;

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate){
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity){
		this.quantity = quantity;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public BaseDTO getDto() {

		InventoryDTO dto = initDTO(new InventoryDTO());

		dto.setSupplierName(supplierName);
		dto.setLastUpdatedDate(lastUpdatedDate);
		dto.setQuantity(quantity);
		dto.setProduct(product);

		System.out.println("all data are done ");

		return dto;
	}
}
