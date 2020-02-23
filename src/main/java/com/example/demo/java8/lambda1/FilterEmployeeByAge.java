package com.example.demo.java8.lambda1;

/**
 * @author WangGuoMing
 * @since 2020/2/23
 */
public class FilterEmployeeByAge implements MyPredicate<Employee> {
    @Override
    public boolean test(Employee employee) {
        return employee.getAge() >= 20;
    }
}
