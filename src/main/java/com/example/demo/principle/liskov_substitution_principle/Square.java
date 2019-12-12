package com.example.demo.principle.liskov_substitution_principle;

/**
 * @author WangGuoMing
 * @since 2019/12/12
 */
public class Square implements Quadrangle {

    private long length;

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    @Override
    public long getHeight() {
        return getLength();
    }

    @Override
    public long getWidth() {
        return getLength();
    }

    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() >= rectangle.getHeight()) {
            rectangle.setHeight(rectangle.getHeight() + 1);
            System.out.println("width: " + rectangle.getWidth() + ", height: " + rectangle.getHeight());
        }
        System.out.println("最终：");
        System.out.println("width: " + rectangle.getWidth() + ", height: " + rectangle.getHeight());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(20);
        rectangle.setHeight(10);
        resize(rectangle);

        /*Square square = new Square();
        square.setLength(10);
        resize(square);*/
    }
}
