package com.olx.masterdata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olx.masterdata.entity.MasterDataAdvStatus;
import com.olx.masterdata.entity.MasterDataCategories;
import com.olx.masterdata.exception.OlxNoAdvStatusFoundException;
import com.olx.masterdata.exception.OlxNoCategoriesFoundException;
import com.olx.masterdata.service.OlxMasterDataService;

@RestController
@RequestMapping("/advertise")
public class OlxMasterDataController {
	@Autowired
	private OlxMasterDataService olxMasterDataService;

	@GetMapping("/category")
	public ResponseEntity<List<MasterDataCategories>> getAllAdvCategories() throws OlxNoCategoriesFoundException {
		List<MasterDataCategories> masterDataCategories = olxMasterDataService.getAllAdvCategories();
		if (masterDataCategories != null) {
			return ResponseEntity.status(HttpStatus.OK).body(masterDataCategories);
		} else

			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(masterDataCategories);

	}

	@GetMapping("/status")
	public ResponseEntity<List<MasterDataAdvStatus>> getAllAdvStatus() throws OlxNoAdvStatusFoundException {
		List<MasterDataAdvStatus> masterDataAdvStatus = olxMasterDataService.getAllAdvStatus();
		if (masterDataAdvStatus != null) {
			return ResponseEntity.status(HttpStatus.OK).body(masterDataAdvStatus);
		} else

			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(masterDataAdvStatus);

	}

}
