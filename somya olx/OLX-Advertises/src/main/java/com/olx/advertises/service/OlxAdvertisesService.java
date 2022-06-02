package com.olx.advertises.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.olx.advertises.entity.OlxAdvertises;
import com.olx.advertises.exception.NoOlxAdvertiseFoundException;

/**
 * @author SG67672
 *
 */
public interface OlxAdvertisesService {
	OlxAdvertises addAdvertisePost(OlxAdvertises olxAdvertises) throws NoOlxAdvertiseFoundException;

	OlxAdvertises updateAdvertisePost(OlxAdvertises olxAdvertise, Integer id) throws NoOlxAdvertiseFoundException;

	List<OlxAdvertises> getAlldvertisesPost() throws NoOlxAdvertiseFoundException;;

	OlxAdvertises readAdvertisePostById(Integer id) throws NoOlxAdvertiseFoundException;;

	Boolean deleteAdvertisePost(Integer id) throws NoOlxAdvertiseFoundException;
	
	List<OlxAdvertises> searchByText(String searchText) throws NoOlxAdvertiseFoundException;
	List<OlxAdvertises> getFilteredAdvertise(String searchText, String category);



	/**
	 * /advertise/search/filtercriteria GET
	 * 
	 * 
	 * Search advertisements based upon given filter criteria
	 * 
	 * 
	 * 
	 * searchText,category, postedBy, dateCondition, onDate, fromDate, toDate,
	 * sortBy, startIndex, records
	 * 
	 * 
	 * Note: this advertise search does not require authenticated user.
	 */

//	OlxAdvertises searcAdvertise() throws NoOlxAdvertiseFoundException;;

	//OlxAdvertises searchAdvertiseByName(String name) throws NoOlxAdvertiseFoundException;

	OlxAdvertises searchAdvertiseByid(Integer id) throws NoOlxAdvertiseFoundException;
}
