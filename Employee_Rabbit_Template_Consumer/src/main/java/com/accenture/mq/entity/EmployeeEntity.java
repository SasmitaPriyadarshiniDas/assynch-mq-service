package com.accenture.mq.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class EmployeeEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer employeeId;
	private String employeeName;
	private double salary;
	private Integer departmentCode;

	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeEntity(String employeeName, Integer employeeId, double salary,
			Integer departmentCode) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.salary = salary;
		this.departmentCode = departmentCode;
	}

	

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Integer getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(Integer departmentCode) {
		this.departmentCode = departmentCode;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeId="
				+ employeeId + ", salary=" + salary + ", departmentCode="
				+ departmentCode + "]";
	}
	
	
}
