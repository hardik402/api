package com.example.fil.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fil.model.Hospital;
import com.example.fil.repository.HospitalRepository;



@Service
public class HospitalService {
	
	@Autowired
	private HospitalRepository hospitalRepository;


public List<Hospital> getAllHospitals(){
	List<Hospital> hospitalList = new ArrayList<Hospital>();
	hospitalRepository.findAll().forEach(hospitalList::add);
	return hospitalList;
}

public Hospital getHospital(int id){
	Optional<Hospital> hospital = hospitalRepository.findById(id);
	if(hospital.isPresent()) {
		return hospital.get();
	}
	return null;
}

public void addHospital(Hospital hospital){
	hospitalRepository.save(hospital);
	
}

public void updateHospital(Hospital hospital){
   hospitalRepository.save(hospital);
}

public void deleteHospital(Hospital hospital) {
   hospitalRepository.delete(hospital);
}
}
