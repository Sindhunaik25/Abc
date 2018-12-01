package com.stream.test;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.OptionalDouble;

public class TestEmployee {

	public static void main(String[] args) {
		LocalDate d1 = LocalDate.of(1980, 12, 17);
		LocalDate d2 = LocalDate.of(1981, 02, 20);
		LocalDate d3 = LocalDate.of(1981, 02, 22);
		LocalDate d4 = LocalDate.of(1981, 04, 02);
		LocalDate d5 = LocalDate.of(1981, 9, 28);
		LocalDate d6 = LocalDate.of(1981, 5, 1);
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(7369, "Smith", "clerk", d1, 7902, 800.0, 0,
				10));
		employees.add(new Employee(7499, "Allenm", "slaesman", d2, 7698, 1600,
				300, 30));
		employees.add(new Employee(7521, "Ward", "slaesman", d3, 7698, 1250,
				500, 30));
		employees.add(new Employee(7566, "Jones", "Manager", d4, 7839, 2975, 0,
				20));
		employees.add(new Employee(7654, "Martin", "slaesman", d5, 7698, 1250,
				1400, 30));
		employees.add(new Employee(7698, "Blake", "clerk", d6, 7839, 2850, 0,
				30));

		// Display all employees from employee table
		System.out.println("Display all employees from employee table");
		employees.stream()
				.map(ename -> ename.getName() + ":" + ename.getEmpNo())
				.forEach(System.out::println);

		System.out.println();

		// Select the employee in department 30
		System.out.println("Select the employee in department 30");
		employees.stream().filter(dno -> dno.getDeptNo() == 30)
				.map(no -> no.getDeptNo() + ":" + no.getName())
				.forEach(System.out::println);

		System.out.println();

		// List the names, numbers and departmentno of all clerks.
		System.out
				.println("List the names, numbers and departmentno of all clerks");
		employees
				.stream()
				.filter(job -> job.getJob() == "clerk")
				.map(no -> no.getDeptNo() + ":" + no.getName() + ":"
						+ no.getJob()).forEach(System.out::println);

		System.out.println();

		// Find the depart numbers and the name of employee of all dept with
		// Deptno greater or equal to 20.
		System.out
				.println("Find the depart numbers and the name of employee of all dept with Deptno greater or equal to 20");
		employees
				.stream()
				.filter(dno -> dno.getDeptNo() >= 20)
				.map(no -> no.getDeptNo() + ":" + no.getName() + ":"
						+ no.getJob()).forEach(System.out::println);

		System.out.println();

		// Find the employees whose commission is greater than their salary
		System.out
				.println("Find the employees whose commission is greater than their salary");
		employees
				.stream()
				.filter(comm -> comm.getComm() > comm.getSalary())
				.map(no -> no.getComm() + ":" + no.getName() + ":"
						+ no.getSalary()).forEach(System.out::println);

		System.out.println();

		// Find the employees whose commission is greater than 60 percent of
		// their salary
		System.out
				.println("Find the employees whose commission is greater than 60 percent of their salary");
		employees
				.stream()
				.filter(comm -> comm.getComm() > 0.6 * comm.getSalary())
				.map(no -> no.getComm() + ":" + no.getName() + ":"
						+ no.getSalary()).forEach(System.out::println);

		System.out.println();

		// List the name, job and salary of all employees in dept 20 who earn
		// more than 2000
		System.out
				.println("List the name, job and salary of all employees in dept 20 who earn more than 2000");
		employees
				.stream()
				.filter(sal -> sal.getDeptNo() == 20 && sal.getSalary() > 2000)
				.map(no -> no.getJob() + ":" + no.getName() + ":"
						+ no.getSalary()).forEach(System.out::println);

		System.out.println();

		// Find all managers who are not in dept 30
		System.out.println("Find all managers who are not in dept 30");
		employees
				.stream()
				.filter(sal -> sal.getDeptNo() != 30
						&& sal.getJob() == "Manager")
				.map(no -> no.getJob() + ":" + no.getName() + ":"
						+ no.getSalary()).forEach(System.out::println);

		System.out.println();

		// Find the employees who earns between Rs. 1200 and Rs.1400.
		System.out
				.println("Find the employees who earns between Rs. 1200 and Rs.1400.");
		// employees
		// .stream()
		// .between(sal -> sal.getSalary() = 30
		// || sal.getSalary() )
		// .map(no -> no.getJob() + ":" + no.getName() + ":"
		// + no.getSalary()).forEach(System.out::println);

		System.out.println();

		// sum of salaries
		System.out.println("sum of salaries");
		double sum = employees.stream().mapToDouble(emp -> emp.getSalary())
				.sum();
		System.out.println(sum);

		System.out.println();

		// maximum salary in employee table
		System.out.println("maximum  salary in employee table");
		OptionalDouble max = employees.stream()
				.mapToDouble(emp -> emp.getSalary()).max();
		System.out.println(max);

		System.out.println();

		// minimum salary employee table
		System.out.println("minimum salary  employee table");
		OptionalDouble min = employees.stream()
				.mapToDouble(emp -> emp.getSalary()).min();
		System.out.println(min);

		System.out.println();

		// Find all employees whose names begin with m.
		System.out.println("Find all employees whose names begin with m");
		employees.stream().filter(name -> name.getName().startsWith("M"))
				.map(name -> name.getName()).forEach(System.out::println);

		System.out.println();

		// Find all employees whose names end with m.
		System.out.println("Find all employees whose names end with m");
		employees.stream().filter(name -> name.getName().endsWith("m"))
				.map(name -> name.getName()).forEach(System.out::println);

		System.out.println();

		// Find all employees whose names contain the letter m
		System.out
				.println("Find all employees whose names contain the letter m");
		employees.stream().filter(name -> name.getName().contains("m"))
				.map(name -> name.getName()).forEach(System.out::println);
	}

}
