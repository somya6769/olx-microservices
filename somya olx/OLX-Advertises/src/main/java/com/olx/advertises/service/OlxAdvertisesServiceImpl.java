package com.olx.advertises.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olx.advertises.entity.OlxAdvertises;
import com.olx.advertises.exception.NoOlxAdvertiseFoundException;
import com.olx.advertises.repository.OlxAdvertisesRepository;

@Service
public class OlxAdvertisesServiceImpl implements OlxAdvertisesService {
	@Autowired
	private OlxAdvertisesRepository olxAdvertisesRepository;

	@Override
	public OlxAdvertises addAdvertisePost(OlxAdvertises olxAdvertises) throws NoOlxAdvertiseFoundException {
		return olxAdvertisesRepository.save(olxAdvertises);
	}

	@Override
	public OlxAdvertises updateAdvertisePost(OlxAdvertises olxAdvertises, Integer id)
			throws NoOlxAdvertiseFoundException {
		OlxAdvertises advertises = olxAdvertisesRepository.findById(id).orElseThrow(
				() -> new NoOlxAdvertiseFoundException("Post Not Update Succesfully or" + id + "Not exitst"));
		if (advertises != null) {
			return olxAdvertisesRepository.save(olxAdvertises);
		}
		throw new NoOlxAdvertiseFoundException("Post With " + id + " \" + advertises + \"Not update or not Exist");
	}

	@Override
	public List<OlxAdvertises> getAlldvertisesPost() throws NoOlxAdvertiseFoundException {
		return (List<OlxAdvertises>) olxAdvertisesRepository.findAll();
	}

	@Override
	public OlxAdvertises readAdvertisePostById(Integer id) throws NoOlxAdvertiseFoundException {

		OlxAdvertises olxAdvertises = olxAdvertisesRepository.findById(id)
				.orElseThrow(() -> new NoOlxAdvertiseFoundException("Invalid Post Id:" + id));
		return olxAdvertises;
	}

	@Override
	public Boolean deleteAdvertisePost(Integer id) throws NoOlxAdvertiseFoundException {
		OlxAdvertises postId = olxAdvertisesRepository.findById(id)
				.orElseThrow(() -> new NoOlxAdvertiseFoundException("Invalid Post Id:" + id + false));

		olxAdvertisesRepository.deleteById(id);
		return true;

	}

//	@Override
//	public OlxAdvertises searcAdvertise() throws NoOlxAdvertiseFoundException {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public OlxAdvertises searchAdvertiseByid(Integer id) throws NoOlxAdvertiseFoundException {
		OlxAdvertises olxAdvertises = olxAdvertisesRepository.findById(id)
				.orElseThrow(() -> new NoOlxAdvertiseFoundException(" Post Not Found with :" + id));
		return olxAdvertises;
	}

	@Override
	public List<OlxAdvertises> searchByText(String searchText) throws NoOlxAdvertiseFoundException {

		List<OlxAdvertises> olxAdvertises = olxAdvertisesRepository.searchByText(searchText);

		if (olxAdvertises != null) {
			return olxAdvertises;
		} else

			throw new NoOlxAdvertiseFoundException("NO Data Found");
	}

	@Override
	public List<OlxAdvertises> getFilteredAdvertise(String searchText, String category) {
		List<OlxAdvertises> advertises = olxAdvertisesRepository.searchByFilterCriteria(searchText, category);
		return advertises;
	}

}
