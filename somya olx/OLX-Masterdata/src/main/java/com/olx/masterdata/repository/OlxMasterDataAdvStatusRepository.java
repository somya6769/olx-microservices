package com.olx.masterdata.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.olx.masterdata.entity.MasterDataAdvStatus;
@Repository
public interface OlxMasterDataAdvStatusRepository  extends CrudRepository<MasterDataAdvStatus, Integer>{

}
