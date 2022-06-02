package com.olx.masterdata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olx.masterdata.entity.MasterDataAdvStatus;
import com.olx.masterdata.entity.MasterDataCategories;
import com.olx.masterdata.exception.OlxNoAdvStatusFoundException;
import com.olx.masterdata.exception.OlxNoCategoriesFoundException;
import com.olx.masterdata.repository.OlxMasterDataAdvStatusRepository;
import com.olx.masterdata.repository.OlxMasterDataCategoriesRepository;
@Service
public class OlxMasterDataServiceImpl implements OlxMasterDataService {
	@Autowired
	private OlxMasterDataCategoriesRepository olxMasterDataCategoriesRepository;
	
	@Autowired
	private OlxMasterDataAdvStatusRepository olxMasterDataAdvStatusRepository;

	@Override
	public List<MasterDataCategories> getAllAdvCategories() throws OlxNoCategoriesFoundException {
		return (List<MasterDataCategories>) olxMasterDataCategoriesRepository.findAll();
	}

	@Override
	public List<MasterDataAdvStatus> getAllAdvStatus() throws OlxNoAdvStatusFoundException {
		
		return (List<MasterDataAdvStatus>) olxMasterDataAdvStatusRepository.findAll();
	}

}
