package com.spring.data.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.data.entity.Emids;
import com.spring.data.service.EmidsService;
@CrossOrigin(origins="*")
@RestController
@RequestMapping("/emids")
public class EmidsController {
	@Autowired
	EmidsService emidsServ;
	
	@GetMapping("/all")
	public List<Emids> getAll(){
		return emidsServ.getAll();
		
	}
	
	@GetMapping("/id/{empId}")
	public Optional<Emids> findByEmpId(@PathVariable("empId") Integer empId) {
		return emidsServ.findByEmpId(empId);
		
	}
	
	@GetMapping("/name/{empName}")
	public List<Emids> findByEmpName(@PathVariable("empName") String empName){
		return emidsServ.findByEmpName(empName);
		
	}
	
	@GetMapping("/role/{empRole}")
	public List<Emids> findByEmpRole(@PathVariable("empRole") String empRole){
		return emidsServ.findByEmpRole(empRole);
		
	}
	@GetMapping("/location/{location}")
	public List<Emids> findByLocation(@PathVariable("location") String location){
		return emidsServ.findByEmpRole(location);
		
	}
	@PostMapping("/save")
	public String saveData(@RequestBody Emids emids) {
		return emidsServ.saveData(emids);
		
	}
	@PutMapping("/update/{empId}")
	public Emids updateData(@RequestBody Emids emids,@PathVariable("empId") Integer empId) {
		return emidsServ.updateData(emids, empId);
		
	}
	
	@DeleteMapping("/delete/{empId}")
	public String deleteData(@PathVariable("empId") Integer empId) {
		return emidsServ.deleteData(empId);
		
	}
	

}
