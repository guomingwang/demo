package com.example.demo.principle.open_closed_principle;

/**
 * @author WangGuoMing
 * @since 2019/12/12
 */
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getDiscountPrice() {
        return super.getPrice() * 0.61;
    }
}
