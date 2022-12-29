package com.spring.data.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.data.entity.Emids;

@Repository
public interface EmidsRepository extends JpaRepository<Emids, Integer>{
	
	public Optional<Emids> findByEmpId(Integer empId);
	
	public List<Emids> findByEmpName(String empName);
	
	public List<Emids> findByEmpRole(String empRole);
	
	public List<Emids> findByLocation(String location);

}
