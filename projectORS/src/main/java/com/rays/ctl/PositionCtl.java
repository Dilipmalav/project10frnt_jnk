package com.rays.ctl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.InventoryDTO;
import com.rays.dto.PositionDTO;
import com.rays.form.PositionForm;
import com.rays.service.InventoryServiceInt;
import com.rays.service.PositionServiceInt;

@RestController
@RequestMapping(value = "Position")
public class PositionCtl extends BaseCtl<PositionForm, PositionDTO, PositionServiceInt> {


	@Autowired
	private PositionServiceInt positionService;

	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload");
		ORSResponse res = new ORSResponse(true);
		PositionDTO dto = new PositionDTO();
		List<DropdownList> list = positionService.search(dto, userContext);
		res.addResult("conditionlist", list);
		return res;
	}
	
}
