package com.example.demo.principle.simple_responsibility_principle;

/**
 * @author WangGuoMing
 * @since 2019/12/12
 */
public class UserInfo {

    private String userName;

    private String address;

    public void modifyUserName(String userName) {
        this.userName = userName;
    }

    public void modifyAddress(String address) {
        this.address = address;
    }
}
