package com.tothenew.JPA_Assignment_2.Repositories;

import com.tothenew.JPA_Assignment_2.Entities.Employee;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {
    @Query("from Employee")
    List<Employee> findAllEmployee();

    @Query("select firstname,lastname from Employee where salary > all(select avg(salary) from Employee)")
    List<Object[]> findPartialDataOfEmployee(Pageable pageable);

    //    @Modifying
//    @Query("update Employee set salary = :value where salary < all(select AVG(salary) from Employee)")
//    void updateSalary(@Param("value")int value);
    @Query("SELECT avg(salary) from Employee")
    int averageSalary();

    @Transactional
    @Modifying
    @Query("UPDATE Employee emp set emp.salary=:sal where emp.salary<:salary1")
    void updateSalary(@Param("salary1") int salary1,@Param("sal") int sal);

    //Q3
    @Query("SELECT min(salary) from Employee")
    int minimumSalary();

    @Transactional
    @Modifying
    @Query("DELETE from Employee emp where emp.salary=:minSalary")
    void deleteEmployeeWithMinSalary(@Param("minSalary") int minSalary);

//    @Modifying
//    @Query("delete from Employee where salary = (select min(salary) from Employee)")
//    void deleteEmployee();

    @Query(value= "select empid,empfirstname,empsalary,empage from employee where emplastname=:lname" , nativeQuery = true)
    List<Object[]> findPartialData(@Param("lname") String lname);

    @Modifying
    @Query(value = "delete from employee where empage> :age" ,nativeQuery = true)
    void deleteEmployee(@Param("age")int age);
}