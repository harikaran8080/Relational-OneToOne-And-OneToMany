package com.mapping.TryMap.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mapping.TryMap.entity.Mapping;
import com.mapping.TryMap.service.ServiceImplement;

@RestController
@RequestMapping("/api")
public class MapController {

	@Autowired
	ServiceImplement implement;

	@PostMapping("/post")
	public Mapping post(@RequestBody Mapping mapping) {
		return implement.post(mapping);

	}
	@GetMapping("/get/{c_id}")
	public Optional<Mapping> get(@PathVariable int c_id ) {
		return implement.get(c_id);
		
	}
	@GetMapping("/getall")
	public List<Mapping> getall(){
		return implement.getall();
	}
	@PostMapping("postall")
	public List<Mapping> postall(@RequestBody List<Mapping> mapping){
		return implement.postall(mapping);
	}
	@PutMapping("/update")
	public Mapping update(@RequestBody Mapping mapping) {
		return implement.update(mapping);
		
	}
	
	@DeleteMapping("/delete/{c_id}")
	public String delete(@PathVariable int c_id) {
		 implement.delete(c_id);
		 return"successfully Deleted";
	}
	
	
	
	

}
