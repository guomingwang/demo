package com.example.demo.principle.composit_aggregate_reuse_principle;

/**
 * @author WangGuoMing
 * @since 2019/12/12
 */
public class Oracle extends DBConnection {

    @Override
    public String getConnection() {
        return "Oracle 连接";
    }
}
