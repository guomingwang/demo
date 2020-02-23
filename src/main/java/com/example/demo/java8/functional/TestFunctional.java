package com.example.demo.java8.functional;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author WangGuoMing
 * @since 2020/2/23
 */
public class TestFunctional {

    // Consumer<T> 消费型接口
    @Test
    public void test1() {
        happy(1000, (m) -> System.out.println("购物 " + m + " 元"));
    }

    public void happy(double money, Consumer<Double> consumer) {
        consumer.accept(money);
    }

    // Supplier<T> 供给型接口
    @Test
    public void test2() {
        List<Integer> numList = getNumList(10, () -> (int) Math.random() * 100);
        for (Integer integer : numList
        ) {
            System.out.println(integer);
        }
    }

    private List<Integer> getNumList(int i, Supplier<Integer> supplier) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int j = 0; j < i; j++) {
            Integer integer = supplier.get();
            arrayList.add(integer);
        }
        return arrayList;
    }

    // Function<T, R> 函数型接口
    @Test
    public void test3() {
        String string = strHandler(" fds d ", (str) -> str.trim());
        System.out.println(string);
        String subStr = strHandler("dsxi ", (str) -> str.substring(2, 4));
        System.out.println(subStr);
    }

    public String strHandler(String str, Function<String, String> function) {
        return function.apply(str);
    }

    // Predicate<T> 断言型接口
    @Test
    public void test4() {
        List<String> list = Arrays.asList(
                "hello", "jj", "Lambda", "www", "ok"
        );
        List<String> stringList = filterStr(list, (s) -> s.length() > 3);
        for (String s : stringList) {
            System.out.println(s);
        }
    }


    public List<String> filterStr(List<String> list, Predicate<String> pre) {
        List<String> strings = new ArrayList<>();
        for (String str : list) {
            if (pre.test(str)) {
                strings.add(str);
            }
        }
        return strings;
    }
}
