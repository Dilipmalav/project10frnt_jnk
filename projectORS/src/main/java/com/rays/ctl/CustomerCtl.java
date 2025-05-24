package com.rays.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.CustomerDTO;
import com.rays.form.CustomerForm;
import com.rays.service.CustomerServiceInt;

@RestController
@RequestMapping(value = "Customer")
public class CustomerCtl extends BaseCtl<CustomerForm, CustomerDTO, CustomerServiceInt> {

	@Autowired
	private CustomerServiceInt customerService;

	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload");
		ORSResponse res = new ORSResponse(true);
		CustomerDTO dto = new CustomerDTO();
		List<DropdownList> list = customerService.search(dto, userContext);
		res.addResult("inlist", list);
		return res;
	}
}
