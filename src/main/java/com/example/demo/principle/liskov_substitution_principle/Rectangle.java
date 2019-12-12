package com.example.demo.principle.liskov_substitution_principle;

/**
 * @author WangGuoMing
 * @since 2019/12/12
 */
public class Rectangle implements Quadrangle {

    private long height;

    private long width;

    @Override
    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    @Override
    public long getWidth() {
        return width;
    }

    public void setWidth(long width) {
        this.width = width;
    }
}
