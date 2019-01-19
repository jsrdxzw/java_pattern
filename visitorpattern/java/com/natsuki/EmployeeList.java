package com.natsuki;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xuzhiwei
 * created at 2018-12-15
 */
public class EmployeeList {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }

    public void accept(Department handler){
        for (Employee employee : employees) {
            employee.accept(handler);
        }
    }
}
