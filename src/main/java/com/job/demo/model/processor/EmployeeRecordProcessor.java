package com.job.demo.model.processor;

import com.job.demo.model.Employee;
import org.springframework.batch.item.ItemProcessor;

public class EmployeeRecordProcessor implements ItemProcessor<Employee, Employee> {
    @Override
    public Employee process(Employee employeeRecord) throws Exception {
        final String name = employeeRecord.getName();
        final String role = employeeRecord.getRole();
        final String salary = employeeRecord.getSalary();

        final Employee employee = new Employee(name, role, salary);
        return employee;
    }
}
