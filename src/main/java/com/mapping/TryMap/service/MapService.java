package com.mapping.TryMap.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapping.TryMap.entity.Mapping;
import com.mapping.TryMap.repository.MapRepository;

@Service
public class MapService implements ServiceImplement {
	
	
	@Autowired
	MapRepository mapRepository;

	@Override
	public Mapping post(Mapping mapping) {
		return mapRepository.save(mapping);
	}

	@Override
	public Optional<Mapping> get(int c_id) {
		return mapRepository.findById(c_id);
	}

	@Override
	public List<Mapping> getall() {
		return mapRepository.findAll();
	}

	@Override
	public List<Mapping> postall(List<Mapping> mapping) {
		return mapRepository.saveAll(mapping);
	}

	@Override
	public Mapping update(Mapping mapping) {
		Optional<Mapping> optional=mapRepository.findById(mapping.getC_id());
		Mapping mapping2 = optional.get();
		mapping2.setPincode(mapping.getPincode());
		mapping2.setCompany_name(mapping.getCompany_name());
		mapping2.setC_id(mapping.getC_id());
		mapping2.setAddress(mapping.getAddress());
		mapRepository.save(mapping2);
		return mapping2;

	}

	@Override
	public String delete(int c_id) {
		mapRepository.deleteById(c_id);
		return "successfully deleted";
	}


	

	

	



}
