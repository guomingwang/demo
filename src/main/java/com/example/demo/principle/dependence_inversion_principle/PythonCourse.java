package com.example.demo.principle.dependence_inversion_principle;

/**
 * @author WangGuoMing
 * @since 2019/12/12
 */
public class PythonCourse implements ICourse {

    @Override
    public void study() {
        System.out.println("学习 Python");
    }
}
