package com.stream.test;

import java.sql.Date;
import java.time.LocalDate;

public class Employee {
	int empNo;
	String name;
	String job;
	LocalDate date;
	int mgr;
	double salary;
	double comm;
	int deptNo;

	public Employee(int empNo, String name, String job, LocalDate date, int mgr,
			double salary, double comm, int deptNo) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.job = job;
		this.date = date;
		this.mgr = mgr;
		this.salary = salary;
		this.comm = comm;
		this.deptNo = deptNo;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getComm() {
		return comm;
	}

	public void setComm(double comm) {
		this.comm = comm;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", name=" + name + ", job=" + job
				+ ", date=" + date + ", mgr=" + mgr + ", salary=" + salary
				+ ", comm=" + comm + ", deptNo=" + deptNo + "]";
	}

}
