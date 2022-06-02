package com.olx.masterdata.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.olx.masterdata.entity.MasterDataCategories;
@Repository
public interface OlxMasterDataCategoriesRepository extends CrudRepository<MasterDataCategories, Integer> {

}
