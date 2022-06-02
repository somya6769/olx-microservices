package com.olx.masterdata.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.olx.masterdata.entity.MasterDataAdvStatus;
import com.olx.masterdata.entity.MasterDataCategories;
import com.olx.masterdata.exception.OlxNoAdvStatusFoundException;
import com.olx.masterdata.exception.OlxNoCategoriesFoundException;


public interface OlxMasterDataService {

	List<MasterDataCategories> getAllAdvCategories() throws OlxNoCategoriesFoundException;

	List<MasterDataAdvStatus> getAllAdvStatus() throws OlxNoAdvStatusFoundException;

}
