package com.tothenew.JPA_Assignment_1;

import com.tothenew.JPA_Assignment_1.Entities.Employee;
import com.tothenew.JPA_Assignment_1.Repositories.JpaRepository;
import com.tothenew.JPA_Assignment_1.Repositories.PagingRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class JpaAssignment1ApplicationTests {

	@Autowired
	JpaRepository jpaRepository;

	@Autowired
	PagingRepository pagingRepository;


	@Test
	void contextLoads() {
	}



	//Question-3
	@Test
	public void createEmployee(){
		Employee employee = new Employee();

		employee.setName("Kandy");
		employee.setAge(20);
		employee.setId(1);
		employee.setLocation("Hisar");
		jpaRepository.save(employee);

		employee.setName("Ayush");
		employee.setAge(21);
		employee.setId(2);
		employee.setLocation("Mirzapur");
		jpaRepository.save(employee);

		employee.setName("Kartik");
		employee.setAge(21);
		employee.setId(3);
		employee.setLocation("Faridabad");
		jpaRepository.save(employee);

		employee.setName("Gunjan");
		employee.setAge(24);
		employee.setId(4);
		employee.setLocation("Delhi");
		jpaRepository.save(employee);

		employee.setName("Arjun");
		employee.setAge(30);
		employee.setId(5);
		employee.setLocation("Hansi");
		jpaRepository.save(employee);

		employee.setName("Deepak");
		employee.setAge(35);
		employee.setId(6);
		employee.setLocation("Meerut");
		jpaRepository.save(employee);

	}



	//Question-4
	@Test
	public void testUpdate(){
		Employee employee = jpaRepository.findById(2).get();
		employee.setLocation("Mumbai");
		jpaRepository.save(employee);
	}



	//Question-5
	@Test
	public void testDelete(){
		jpaRepository.deleteById(3);
	}



	//Question-6
	@Test
	public void testRead(){
		Employee employee = jpaRepository.findById(1).get();
		assertNotNull(employee);
		assertEquals("Kandy",employee.getName());
		System.out.println(">>>>>>>>>>>>>>>>>>>>>"+employee.getLocation());
	}



	//Question-7
	@Test
	public void testCount(){
		System.out.println(">>>>>>>>>>>>>>>>"+jpaRepository.count());
	}



	//Question-8
	@Test
	public void testPageableAndSorting(){
		Pageable pageable = PageRequest.of(0,2, Sort.Direction.DESC,"age");
		pagingRepository.findAll(pageable).forEach(p->System.out.println(p.getName()));
	}



	//Question-9
	@Test
	public void testFindByName(){
		List<Employee> employeeList = jpaRepository.findByName("Kandy");
		employeeList.forEach(p-> System.out.println(p.getId()+" " + p.getAge()
				+" "+ p.getName() +" "+ p.getLocation() ));
	}



	//Question-10
	@Test
	public void testFindByNameLike(){
		List<Employee> employeeList = jpaRepository.findByNameLike("A%");
		employeeList.forEach(p -> System.out.println(p.getId()+" "+p.getAge()+
				" "+p.getName()+" "+p.getLocation()));
	}



	//Question-11
	@Test
	public void testFindByAgeBetween(){
		List<Employee> employeeList = jpaRepository.findByAgeBetween(28,32);
		employeeList.forEach(p -> System.out.println(p.getId()+" "+p.getAge()+
				" "+p.getName()+" "+p.getLocation()));
	}
}
