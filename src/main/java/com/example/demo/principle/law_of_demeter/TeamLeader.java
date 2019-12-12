package com.example.demo.principle.law_of_demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author WangGuoMing
 * @since 2019/12/12
 */
public class TeamLeader {

    public void checkNumberOfCourses() {
        List<Course> courseList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        System.out.println("已发布课程数量： " + courseList.size());
    }
}
