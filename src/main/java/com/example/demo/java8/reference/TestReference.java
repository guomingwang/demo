package com.example.demo.java8.reference;

import com.example.demo.java8.lambda1.Employee;
import org.junit.Test;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author WangGuoMing
 * @since 2020/2/23
 */
public class TestReference {

    // 对象::实例方法名
    @Test
    public void test1() {
        PrintStream printStream = System.out;
        Consumer<String> consumer = (x) -> printStream.println(x);
        PrintStream printStream1 = System.out;
        Consumer<String> consumer1 = printStream1::println;
        Consumer<String> consumer2 = System.out::println;
        consumer2.accept("abc");
    }

    @Test
    public void test2() {
        final Employee employee = new Employee();
        Supplier<String> supplier = () -> employee.getName();
        String s = supplier.get();
        System.out.println(s);
        Supplier<String> supplier2 = employee::getName;
        String s1 = supplier2.get();
        System.out.println(s1);
    }

    // 类：静态方法名
    @Test
    public void test3() {
        Comparator<Integer> comparator = (x, y) -> Integer.compare(x, y);
        Comparator<Integer> comparator1 = Integer::compareTo;
    }

    // 类：实例方法名
    @Test
    public void test4() {
        BiPredicate<String, String> bp = (x, y) -> x.equals(y);
        BiPredicate<String, String> bp2 = String::equals;
    }

    // 构造器引用
    @Test
    public void test5() {
        Supplier<Employee> supplier = () -> new Employee();
        // 无参构造
        Supplier<Employee> supplier1 = Employee::new;
        System.out.println(supplier1.get());
        // 有参构造
        Function<String, Employee> function = (x) -> new Employee("a");
        Function<String, Employee> function1 = Employee::new;
        System.out.println(function1.apply("a"));
    }

    // 数组引用
    @Test
    public void test6() {
        Function<Integer, String[]> function = (x) -> new String[x];
        String[] strings = function.apply(10);
        System.out.println(strings.length);
        Function<Integer, String[]> function1 = String[]::new;
        String[] strings1 = function1.apply(2);
        System.out.println(strings1.length);
    }
}
