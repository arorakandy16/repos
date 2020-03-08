package com.RESTAssignment1.RESTful_A1.Employee;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class EmployeeService {
    private static List<EmployeeBean> employee = new ArrayList<>();
    static Integer usercount = 3;

    static {
        employee.add(new EmployeeBean(1, "Kandy Arora", 20));
        employee.add(new EmployeeBean(2, "Ayush Thomas", 24));
        employee.add(new EmployeeBean(3, "Gunjan Dawar", 24));
    }

    //Question 3 GET method for list of all employees

    public List<EmployeeBean> findAll() {
        return employee;
    }
    //-------------------------------------------------------------------------------------------------

    //Question 4 GET method for one employee

    public EmployeeBean findOne(int id) {
        for (EmployeeBean employeeBean : employee) {
            if (employeeBean.getId() == id)
                return employeeBean;
        }
        return null;
    }
    //---------------------------------------------------------------------------------------------------

    //Question 5 Implement POST http request for Employee to create a new employee.
    public EmployeeBean save(EmployeeBean employeeBean) {
        if (employeeBean.getId() == null) {
            employeeBean.setId(++usercount);
        }
        employee.add(employeeBean);
        return employeeBean;
    }

    //----------------------------------------------------------------------------------------------------

    //Question 7 - DELETE METHOD
    public EmployeeBean deleteById(int id){
        Iterator<EmployeeBean> iterator = employee.iterator();
        while(iterator.hasNext()){
            EmployeeBean employeeBean = iterator.next();
            if(employeeBean.getId()==id)
                iterator.remove();
            return employeeBean;
        }
        return null;
    }
    //------------------------------------------------------------------------------------------------------

    //Question 8 PUT method
    public EmployeeBean findId(int id) {
        Iterator<EmployeeBean> iterator = employee.iterator();
        while(iterator.hasNext()){
            EmployeeBean employeeBean = iterator.next();
            if(employeeBean.getId()==id)
                return employeeBean;
        }
        return null;
    }
    //-------------------------------------------------------------------------------------------------------
}

