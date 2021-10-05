package com.example.fil.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.fil.model.Hospital;

@Repository
public interface HospitalRepository extends CrudRepository<Hospital, Integer> {

}
