package com.example.demo.java8.lambda2;

import com.example.demo.java8.lambda1.Employee;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author WangGuoMing
 * @since 2020/2/23
 */
public class TestLambda2 {

    // 语法格式一：无参数，无返回值
    @Test
    public void test1() {
        // 通过匿名内部类的方式实现接口
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello, world!");
            }
        };
        r.run();
        System.out.println("--------------------------------");
        // Lambda 表达式代替匿名内部类
        Runnable r1 = () -> System.out.println("hello, word!");
        r.run();
    }

    // 语法格式二：有一个参数，并且无返回值
    @Test
    public void Test2() {
        Consumer<String> com = (x) -> System.out.println(x);
        com.accept("啦啦啦");
    }

    // 语法格式三：若只有一个参数，小括号可以不写

    // 语法格式四：有两个以上的参数，有返回值，并且 Lambda 体中有多条语句
    @Test
    public void test3() {
        Comparator<Integer> com = (x, y) -> {
            System.out.println("函数式接口");
            return Integer.compare(x, y);
        };
    }

    // 语法格式五：若 Lambda 体中只有一条语句，大括号和 return 都可以省略不写
    @Test
    public void test4() {
        Comparator<Integer> com = (x, y) -> Integer.compare(x, y);
    }

    // 语法格式六：Lambda 表达式的参数列表的数据类型可以省略不写，
    //          因为 JVM 编译器通过上下文推断出数据类型，即“类型推断”

    // 需求：对一个数进行运算
    @Test
    public void test6() {
        Integer num = operation(100, (x) -> x * x);
        System.out.println(num);
        System.out.println(operation(200, (y) -> y + 200));
    }

    public Integer operation(Integer num, MyFun mf) {
        return mf.getValue(num);
    }

    List<Employee> employees = Arrays.asList(
            new Employee("张三", 18, 9496.2),
            new Employee("李四", 52, 2396.2),
            new Employee("王五", 56, 996.2),
            new Employee("赵六", 8, 94.2)
    );

    @Test
    public void test7() {
        Collections.sort(employees, (e1, e2) -> {
            if (e1.getAge() == e2.getAge()) {
                return e1.getName().compareTo(e2.getName());
            } else {
                return Integer.compare(e1.getAge(), e2.getAge());
            }
        });
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
