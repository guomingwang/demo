package com.example.demo.principle.dependence_inversion_principle;

/**
 * 构造器注入
 *
 * @author WangGuoMing
 * @since 2019/12/12
 */
public class TomOfConstructor {

    private ICourse course;

    public TomOfConstructor(ICourse course) {
        this.course = course;
    }

    public void study() {
        course.study();
    }

    public static void main(String[] args) {
        TomOfConstructor tomOfConstructor = new TomOfConstructor(new JavaCourse());
        tomOfConstructor.study();
    }
}
