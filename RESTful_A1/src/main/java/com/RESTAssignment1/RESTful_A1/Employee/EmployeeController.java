package com.RESTAssignment1.RESTful_A1.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class EmployeeController {

    //Question 3 GET method for list of all employees

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "/employees")
    public List<EmployeeBean> retrieveAllEmployees() {
        return employeeService.findAll();
    }

    //-------------------------------------------------------------------------------------------------

    //Question 4 GET method for one employee
    @GetMapping(path = "/employees/{id}")
    public EmployeeBean retrieveOne(@PathVariable int id) {
        EmployeeBean employeeBean = employeeService.findOne(id);

        //---------------------------------------------------------------------------------------------

       //Question 6 - throwing exception for resource not found
        if(employeeBean==null)
            throw new EmployeeNotFoundException("id"+id);
        //-----------------------------------------------------------------------------------------------
        return employeeBean;
    }

    //--------------------------------------------------------------------------------------------------

    //Question 5 Implement POST http request for Employee to create a new employee.

//    @PostMapping(path = "/employees")
//    public void createEmployee(@RequestBody EmployeeBean employeeBean){
//        EmployeeBean employee = employeeService.save(employeeBean);
//    }

    @PostMapping("/employees")
    public ResponseEntity<Object> createEmployee(@Valid @RequestBody EmployeeBean employeeBean){
        //--------------------------@Valid used for Question No 9
        EmployeeBean employee = employeeService.save(employeeBean);

        URI location = ServletUriComponentsBuilder.
                fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(employee.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    //----------------------------------------------------------------------------------------------------

    //Question 7 - DELETE METHOD
    @DeleteMapping(path="/employees/{id}")
    public void deleteEmployee(@PathVariable int id){
        EmployeeBean employeeBean = employeeService.deleteById(id);

        //-------------------------------------------------------------------------------------------------

        //Question 6 - throwing exception for resource not found
        if(employeeBean==null)
            throw new EmployeeNotFoundException("id"+id);
        //-------------------------------------------------------------------------------------------------

    }

    //Question 8 PUT method
    @PutMapping("/employees/{id}")

    public ResponseEntity<Object> updateEmployee(@PathVariable int id, @RequestBody EmployeeBean employeeBean){
        EmployeeBean employee = employeeService.findId(id);
        employee.setName(employeeBean.getName());
        employee.setAge(employeeBean.getAge());
        EmployeeBean employees = employeeService.save(employee);

        URI location = ServletUriComponentsBuilder.
                fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(employee.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }
}