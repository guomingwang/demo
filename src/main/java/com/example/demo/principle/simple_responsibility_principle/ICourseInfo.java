package com.example.demo.principle.simple_responsibility_principle;

/**
 * @author WangGuoMing
 * @since 2019/12/12
 */
public interface ICourseInfo {

    // 获得基本信息
    String getCourseName();

    // 获得视频流
    byte[] getCourseVideo();
}
