package com.example.demo.principle.dependence_inversion_principle;

/**
 * @author WangGuoMing
 * @since 2019/12/12
 */
public class Tom {

    public void study(ICourse course) {
        course.study();
    }

    public static void main(String[] args) {
        Tom tom = new Tom();
        tom.study(new JavaCourse());
        tom.study(new PythonCourse());
    }
}
