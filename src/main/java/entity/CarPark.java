package entity;

/**
 * Created by Administrator on 2020/6/30.
 */
public class CarPark {
    private int width ;
    private int length ;

    public CarPark() {
    }

    public CarPark(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
