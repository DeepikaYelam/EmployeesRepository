package com.spring.data.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="data")
public class Emids {
	
	@Id
	private Integer empId;
	private String empName;
	private String empRole;
	private String location;
	private String company;
	private String imgUrl;
	public Emids() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emids(Integer empId, String empName, String empRole, String location, String company, String imgUrl) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empRole = empRole;
		this.location = location;
		this.company=company;
		this.imgUrl = imgUrl;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpRole() {
		return empRole;
	}
	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	@Override
	public String toString() {
		return "Emids [empId=" + empId + ", empName=" + empName + ", empRole=" + empRole + ", location=" + location
				+ ", company=" + company + ", imgUrl=" + imgUrl + "]";
	}
	
	
	

}
