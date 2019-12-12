package com.example.demo.principle.composit_aggregate_reuse_principle;

/**
 * @author WangGuoMing
 * @since 2019/12/12
 */
public class ProductDao {

    private DBConnection dbConnection;

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct() {
        String conn = dbConnection.getConnection();
        System.out.println("使用 " + conn + " 增加产品");
    }
}
