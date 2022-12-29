package com.spring.data.service;

import java.util.List;
import java.util.Optional;

import com.spring.data.entity.Emids;

public interface EmidsService {
	
	public Optional<Emids> findByEmpId(Integer empId);
	
	public List<Emids> findByEmpName(String empName);
	
	public List<Emids> findByEmpRole(String empRole);
	
	public List<Emids> findByLocation(String location);
	
	public List<Emids> getAll();
	
	public String saveData(Emids emids);
	
	public Emids updateData(Emids emids, Integer empId);
	
	public String deleteData(Integer empId);

}
