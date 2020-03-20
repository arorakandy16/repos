package com.tothenew.JPA_Assignment_2;

import com.tothenew.JPA_Assignment_2.Entities.Embeded.EmployeeDetail;
import com.tothenew.JPA_Assignment_2.Entities.Embeded.Salary;
import com.tothenew.JPA_Assignment_2.Entities.Employee;
import com.tothenew.JPA_Assignment_2.Entities.InheritanceMapping.CardPay;
import com.tothenew.JPA_Assignment_2.Entities.InheritanceMapping.CheckPay;
import com.tothenew.JPA_Assignment_2.Repositories.EmbededRepository;
import com.tothenew.JPA_Assignment_2.Repositories.EmployeeRepository;
import com.tothenew.JPA_Assignment_2.Repositories.InheritanceRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.annotation.Rollback;

import javax.transaction.Transactional;
import java.util.List;

@SpringBootTest
class JpaAssignment2ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	InheritanceRepository inheritanceRepository;


	@Test
	void createEmployee(){
		Employee employee = new Employee();
		employee.setFirstName("Kandy");
		employee.setLastName("Arora");
		employee.setAge(20);
		employee.setSalary(15100);

		employeeRepository.save(employee);



		Employee employee2 = new Employee();
		employee2.setFirstName("Ayush");
		employee2.setLastName("Thomas");
		employee2.setAge(24);
		employee2.setSalary(18000);

		employeeRepository.save(employee2);



		Employee employee3 = new Employee();
		employee3.setFirstName("Gunjan");
		employee3.setLastName("Dawar");
		employee3.setAge(24);
		employee3.setSalary(20000);

		employeeRepository.save(employee3);



		Employee employee4 = new Employee();
		employee4.setFirstName("Kartik");
		employee4.setLastName("Kumar");
		employee4.setAge(48);
		employee4.setSalary(25000);

		employeeRepository.save(employee4);



		Employee employee5 = new Employee();
		employee5.setFirstName("Ayush");
		employee5.setLastName("Agrawal");
		employee5.setAge(21);
		employee5.setSalary(30000);

		employeeRepository.save(employee5);

	}

	//	JPQL:

	//1	Display the first name, last name of all employees having salary greater than
// average salary ordered in ascending by their age and in descending by their salary.
	@Test
	public void testRetrievePartialData()
	{
		List<Object[]> partial=employeeRepository.findPartialDataOfEmployee
				(PageRequest.of(0,5, Sort.by("salary").descending().and(Sort.by("age"))));
		for(Object[] objects:partial) {
			System.out.println(objects[0]);
			System.out.println(objects[1]);
		}
	}

	//Update salary of all employees by a salary passed as a parameter whose
	// existing salary is less than the average salary.
	@Test
	public void updateSalary(){
		int avgSalary = employeeRepository.averageSalary();
		employeeRepository.updateSalary(avgSalary,18000);
		System.out.println(employeeRepository.findAll());
	}

	//Delete employees with minimum salary.
	@Test
	public void deleteEmployee(){
		int minSalary = employeeRepository.minimumSalary();
		employeeRepository.deleteEmployeeWithMinSalary(minSalary);
		System.out.println(employeeRepository.findAll());
	}



//	@Test
//	@Transactional
//	public void testDeleteSalary()
//	{
//		employeeRepository.deleteEmployee();
//	}

	//Display the id, first name, age of all employees where last name ends with "singh"
	@Test
	public void testPartialData()
	{
		List<Object[]> partial=employeeRepository.findPartialData("Thomas");
		for(Object[] objects:partial) {
			System.out.println(objects[0]);
			System.out.println(objects[1]);
			System.out.println(objects[2]);
			System.out.println(objects[3]);
		}
	}
	//Delete all employees with age greater than 45

	@Test
	@Transactional
	@Rollback(false)
	public void testDeleteEmployee()
	{
		employeeRepository.deleteEmployee(45);
	}


	@Test
	public void addMappingData()
	{
		CheckPay checkPay=new CheckPay();
		checkPay.setChecknumber("24367");
		checkPay.setId(1);
		checkPay.setamount(2543);

		CardPay cardPay=new CardPay();
		cardPay.setCardnumber("2656");
		cardPay.setId(1);
		cardPay.setamount(6473);

		inheritanceRepository.save(checkPay);
		inheritanceRepository.save(cardPay);
	}

	@Autowired
	EmbededRepository embededRepository;

	@Test
	public void addEmbedData()
	{
		EmployeeDetail employeeDetail=new EmployeeDetail();
		employeeDetail.setFirstName("Kandy");
		employeeDetail.setLastName("Arora");
		//employee.setId();
		employeeDetail.setAge(20);
		Salary salary=new Salary();
		salary.setBasicSalary(1000);
		salary.setBonusSalary(2000);
		salary.setSpecialAllowanceSalary(6432);
		salary.setTaxAmount(7872);
		employeeDetail.setSalary(salary);

		embededRepository.save(employeeDetail);

	}

}
