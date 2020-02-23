package com.example.demo.java8.lambda1;

import org.junit.Test;

import java.util.*;

/**
 * @author WangGuoMing
 * @since 2020/2/23
 */
public class TestLambda1 {

    // 原来的匿名内部类
    @Test
    public void test1() {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        TreeSet<Integer> treeSet = new TreeSet<>(comparator);
    }

    // Lambda 表达式
    @Test
    public void test2() {
        Comparator<Integer> comparator = (x, y) -> Integer.compare(x, y);
        TreeSet<Integer> treeSet = new TreeSet<>(comparator);
    }

    List<Employee> employees = Arrays.asList(
            new Employee("张三", 18, 9496.2),
            new Employee("李四", 52, 2396.2),
            new Employee("王五", 56, 996.2),
            new Employee("赵六", 8, 94.2)
    );

    @Test
    public void test3() {
        // 需求：获取当前公司中年龄大于 35 的员工信息
        List<Employee> emps = filterEmployees1(employees);
        for (Employee e : emps) {
            System.out.println(e);
        }
        System.out.println("--------------------------------");
        // 需求：获取当前公司中员工工资大于 2000 的员工信息
        List<Employee> emps2 = filterEmployee2(employees);
        for (Employee e : emps2) {
            System.out.println(e);
        }
    }

    private List<Employee> filterEmployee2(List<Employee> employees) {
        ArrayList<Employee> emps = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp.getSalary() >= 2000) {
                emps.add(emp);
            }
        }
        return emps;
    }

    private List<Employee> filterEmployees1(List<Employee> employees) {
        ArrayList<Employee> emps = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp.getAge() >= 35) {
                emps.add(emp);
            }
        }
        return emps;
    }

    @Test
    public void test4() {
        List<Employee> emps = filterEmployees(employees, new FilterEmployeeByAge());
        for (Employee e : emps) {
            System.out.println(e);
        }
        System.out.println("--------------------------------");
        List<Employee> emps2 = filterEmployees(employees, new FilterEmployeeBySalary());
        for (Employee e : emps2) {
            System.out.println(e);
        }
    }

    // 优化方式一：策略设计模式
    public List<Employee> filterEmployees(List<Employee> employees, MyPredicate<Employee> myPredicate) {
        ArrayList<Employee> employees1 = new ArrayList<>();
        for (Employee emp : employees) {
            if (myPredicate.test(emp)) {
                employees.add(emp);
            }
        }
        return employees;
    }

    // 优化方式二：匿名内部类
    @Test
    public void test5() {
        List<Employee> list = filterEmployees(employees, new MyPredicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getSalary() >= 2000;
            }
        });
        for (Employee e : list) {
            System.out.println(e);
        }
    }

    // 优化方式三：Lambda 表达式
    @Test
    public void test6() {
        List<Employee> employees = filterEmployees(this.employees, (e) -> e.getSalary() >= 2000);
        employees.forEach(System.out::println);
    }

    // 优化方式四：Stream API
    @Test
    public void test7() {
        employees.stream()
                .filter((e) -> e.getSalary() >= 2000)
                .forEach(System.out::println);
        System.out.println("--------------------------------");
        employees.stream()
                .map(Employee::getSalary)
                .forEach(System.out::println);
    }
}
