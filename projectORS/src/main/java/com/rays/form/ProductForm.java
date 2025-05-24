package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ProductDTO;
import com.rays.dto.RoleDTO;

public class ProductForm extends BaseForm {

	@NotEmpty(message = "please enter productName")
	private String productName;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public BaseDTO getDto() {

		ProductDTO dto = initDTO(new ProductDTO());
		dto.setProductName(productName);
		return dto;

	}

}
