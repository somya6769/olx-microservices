package com.olx.advertises.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.olx.advertises.entity.OlxAdvertises;

@Repository
public interface OlxAdvertisesRepository extends CrudRepository<OlxAdvertises, Integer> {
	
	@Query(value = "SELECT * FROM advertises WHERE category LIKE %:searchByText% or description LIKE"
			+ " %:searchByText% or status LIKE %:searchByText% or title LIKE %:searchByText% or username"
			+ " LIKE %:searchByText%", nativeQuery = true)
	List<OlxAdvertises > searchByText(@Param("searchByText") String searchText);

	@Query(value = "SELECT * FROM advertises WHERE category LIKE %:search% or description LIKE"
			+ " %:search% or status LIKE %:search% or title LIKE %:search% or username"
			+ " LIKE %:search% or category LIKE %:categorys%", nativeQuery = true)
	List<OlxAdvertises> searchByFilterCriteria(@Param("search") String searchText, @Param("categorys") String category);

	

	
	
	
	
	
	
	
	
	

	
	//OlxAdvertises findOlxAdvertises(String searchText);
	/*
	 * 
	 * 
	 * @Query(value = "SELECT * FROM advertises WHERE description LIKE\r\n"
			+ " '%:text%' or status LIKE '%:text%' or posted_by like '%:text%';", nativeQuery = true)
	OlxAdvertises searchByText(@Param(value = "text") String searchText);

	 * 
	 * 
	 * 
	 * 
	 * 
	 * // @Query("Select c from OlxAdvertises c where c.description like :text") //
	 * List<OlxAdvertises> searchByText(@Param("text") String searchText);
	 * // @Query(value = "SELECT * FROM advertises WHERE description LIKE\r\n" // +
	 * " '%:?%' or status LIKE '%:?%' or posted_by like '%:?%';",nativeQuery = true)
	 * // OlxAdvertises searchByText(String searchText);
	 * 
	 * @Query(value ="SELECT * FROM advertises\r\n" +
	 * "WHERE description LIKE '%:text%'\r\n" + "   OR tittle LIKE '%:text%'\r\n" +
	 * "   or posted_by like '%:text%';\r\n" + "",nativeQuery = true)
	 * List<OlxAdvertises> searchByText(@Param("text") String searchText);
	 **/

}
