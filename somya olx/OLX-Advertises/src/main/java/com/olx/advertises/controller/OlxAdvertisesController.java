package com.olx.advertises.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.olx.advertises.entity.OlxAdvertises;
import com.olx.advertises.exception.NoOlxAdvertiseFoundException;
import com.olx.advertises.service.OlxAdvertisesService;

@RestController
public class OlxAdvertisesController {
	@Autowired
	private OlxAdvertisesService olxAdvertisesService;

	@PostMapping("/advertise")
	public ResponseEntity<OlxAdvertises> addAdvertisePost(@RequestBody OlxAdvertises olxAdvertises)
			throws NoOlxAdvertiseFoundException {
		OlxAdvertises advertises = olxAdvertisesService.addAdvertisePost(olxAdvertises);

		return ResponseEntity.status(HttpStatus.CREATED).body(advertises);
	}

	// auth-token need to impl we have not learn for now

	@PutMapping("/advertise/{id}")
	public ResponseEntity<OlxAdvertises> updateAdvertisePost(@RequestBody OlxAdvertises olxAdvertise,
			@PathVariable("id") Integer id) throws NoOlxAdvertiseFoundException {
		OlxAdvertises advertises = olxAdvertisesService.updateAdvertisePost(olxAdvertise, id);

		return ResponseEntity.status(HttpStatus.OK).body(advertises);

	}

	@GetMapping("/user/advertise")
	public ResponseEntity<List<OlxAdvertises>> getAlldvertisesPost() throws NoOlxAdvertiseFoundException {
		List<OlxAdvertises> advertises = olxAdvertisesService.getAlldvertisesPost();

		return ResponseEntity.status(HttpStatus.OK).body(advertises);

	}

	@PostMapping("/user/advertise/{id}")
	public ResponseEntity<OlxAdvertises> readAdvertisePostById(@PathVariable Integer id)
			throws NoOlxAdvertiseFoundException {
		OlxAdvertises advertises = olxAdvertisesService.readAdvertisePostById(id);

		return ResponseEntity.status(HttpStatus.OK).body(advertises);

	}

	@DeleteMapping("/user/advertise/{postId}")
	public ResponseEntity<Boolean> deleteAdvertisePost(@PathVariable("postId") Integer id)
			throws NoOlxAdvertiseFoundException {
		Boolean advertises = olxAdvertisesService.deleteAdvertisePost(id);

		return ResponseEntity.status(HttpStatus.CREATED).body(advertises);

	}

	@GetMapping("/advertise/{id}")
	public ResponseEntity<OlxAdvertises> searchAdvertiseByid(@PathVariable Integer id)
			throws NoOlxAdvertiseFoundException {
		OlxAdvertises advertises = olxAdvertisesService.searchAdvertiseByid(id);
		if (advertises != null) {
			return ResponseEntity.status(HttpStatus.OK).body(advertises);
		}

		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(advertises);
	}

	@GetMapping("/advertise/search")
	public ResponseEntity<List<OlxAdvertises>> getAdvertiseBysearchText(
			@RequestParam(value = "searchText", required = true) String searchText)
			throws NoOlxAdvertiseFoundException {
		return ResponseEntity.status(HttpStatus.OK).body(olxAdvertisesService.searchByText(searchText));
	}

	@GetMapping("/advertise/search/filtercriteria")
	public ResponseEntity<List<OlxAdvertises>> getFilteredAdvertise(
			@RequestParam(value = "searchText", defaultValue = "OPEN", required = false) String searchText,
			@RequestParam(value = "category", defaultValue = "Smartphone ", required = false) String category) {

		return ResponseEntity.status(HttpStatus.OK)
				.body(olxAdvertisesService.getFilteredAdvertise(searchText, category));

	}

}
