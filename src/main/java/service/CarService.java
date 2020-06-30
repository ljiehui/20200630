package service;

import entity.Car;
import entity.CarPark;
import entity.Orientation;

/**
 * Created by Administrator on 2020/6/29.
 */
public interface CarService {
    void move(String command, Car car,CarPark carPark);

    int getPositionX(Car car,CarPark carPark);

    int getPositionY(Car car,CarPark carPark);

    Orientation getOrientation(Car car, CarPark carPark);


}
