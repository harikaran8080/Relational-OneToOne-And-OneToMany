package com.mapping.TryMap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mapping.TryMap.entity.Mapping;
@Repository
public interface MapRepository extends JpaRepository<Mapping, Integer> {

}