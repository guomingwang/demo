package com.example.demo.principle.simple_responsibility_principle;

/**
 * @author WangGuoMing
 * @since 2019/12/12
 */
public class Course {

    public void study(String courseName) {
        if ("直播课".equals(courseName)) {
            System.out.println(courseName + ": 不能快进看");
        } else {
            System.out.println(courseName + ": 可以反复看");
        }
    }

    public static void main(String[] args) {
        Course course = new Course();
        course.study("直播课");
        course.study("录播课");
        System.out.println("********************************");
        LiveCourse liveCourse = new LiveCourse();
        liveCourse.study("直播课");
        ReplayCourse replayCourse = new ReplayCourse();
        replayCourse.study("录播课");
    }
}
