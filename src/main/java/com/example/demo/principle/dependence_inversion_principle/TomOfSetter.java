package com.example.demo.principle.dependence_inversion_principle;

/**
 * Setter 注入方式
 *
 * @author WangGuoMing
 * @since 2019/12/12
 */
public class TomOfSetter {

    private ICourse course;

    public void setCourse(ICourse course) {
        this.course = course;
    }

    public void study() {
        course.study();
    }

    public static void main(String[] args) {
        TomOfSetter tomOfSetter = new TomOfSetter();
        tomOfSetter.setCourse(new JavaCourse());
        tomOfSetter.study();
        tomOfSetter.setCourse(new PythonCourse());
        tomOfSetter.study();
    }
}
