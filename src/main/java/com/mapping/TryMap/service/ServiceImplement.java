package com.mapping.TryMap.service;

import java.util.List;
import java.util.Optional;

import com.mapping.TryMap.entity.Mapping;

public interface ServiceImplement {

	Mapping post(Mapping mapping);

	Optional<Mapping> get(int c_id);

	List<Mapping> getall();

	List<Mapping> postall(List<Mapping> mapping);

	Mapping update(Mapping mapping);

	String delete(int c_id);

	
	

}
