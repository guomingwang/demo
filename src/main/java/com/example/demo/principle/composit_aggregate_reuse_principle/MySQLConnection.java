package com.example.demo.principle.composit_aggregate_reuse_principle;

/**
 * @author WangGuoMing
 * @since 2019/12/12
 */
public class MySQLConnection extends DBConnection {

    @Override
    public String getConnection() {
        return "MySQL 连接";
    }
}
