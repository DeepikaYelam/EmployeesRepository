package com.spring.data.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.data.entity.Emids;
import com.spring.data.repository.EmidsRepository;

@Service
public class EmidsServiceImpl implements EmidsService{
	
	@Autowired
	EmidsRepository emidsRepo;

	@Override
	public Optional<Emids> findByEmpId(Integer empId) {
		// TODO Auto-generated method stub
		Optional<Emids> byId=emidsRepo.findById(empId);
		return byId;
	}

	@Override
	public List<Emids> findByEmpName(String empName) {
		// TODO Auto-generated method stub
		List<Emids> byName=emidsRepo.findByEmpName(empName);
		return byName;
	}

	@Override
	public List<Emids> findByEmpRole(String empRole) {
		// TODO Auto-generated method stub
		List<Emids> byRole=emidsRepo.findByEmpRole(empRole);
		return byRole;
	}

	@Override
	public List<Emids> findByLocation(String location) {
		// TODO Auto-generated method stub
		List<Emids> byLocation=emidsRepo.findByLocation(location);
		return byLocation;
	}

	@Override
	public List<Emids> getAll() {
		// TODO Auto-generated method stub
		List<Emids> all=emidsRepo.findAll();
		return all;
	}

	@Override
	public String saveData(Emids emids) {
		// TODO Auto-generated method stub
		if(emidsRepo.existsById(emids.getEmpId())) {
			return "Employee Data Already Exists";
		}
		else {
			emidsRepo.save(emids);
			return "Successfully Added";
		}
	}

	@Override
	public Emids updateData(Emids emids, Integer empId) {
		// TODO Auto-generated method stub
		Emids update=emidsRepo.findById(empId).get();
		if(Objects.nonNull(emids.getEmpName()) && ! " ".equalsIgnoreCase(emids.getEmpName())) {
			update.setEmpName(emids.getEmpName());
		}
		if(Objects.nonNull(emids.getEmpRole()) && ! " ".equalsIgnoreCase(emids.getEmpRole())) {
			update.setEmpRole(emids.getEmpRole());
		}
		if(Objects.nonNull(emids.getImgUrl()) && ! " ".equalsIgnoreCase(emids.getImgUrl())) {
			update.setImgUrl(emids.getImgUrl());
		}
		if(Objects.nonNull(emids.getCompany()) && ! " ".equalsIgnoreCase(emids.getCompany())) {
			update.setCompany(emids.getCompany());
		}
		if(Objects.nonNull(emids.getLocation()) && ! " ".equalsIgnoreCase(emids.getLocation())) {
			update.setLocation(emids.getLocation());
		}
		return emidsRepo.save(update);
	}

	@Override
	public String deleteData(Integer empId) {
		// TODO Auto-generated method stub
		if(!(emidsRepo.existsById(empId))) {
			return "Invalid Data";
		}
		emidsRepo.deleteById(empId);
		return "Deleted Successfully";
	}

}
