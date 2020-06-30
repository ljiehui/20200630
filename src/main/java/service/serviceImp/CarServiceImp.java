package service.serviceImp;

import entity.Car;
import entity.CarPark;
import entity.Orientation;
import service.CarService;
import static entity.Orientation.*;

/**
 * Created by Administrator on 2020/6/29.
 */
public class CarServiceImp implements CarService {

    public void move(String command, Car car, CarPark carPark) {
        if("forward".equalsIgnoreCase(command) ){
            checkForWard(car,carPark);
        }else if("clockwise".equalsIgnoreCase(command) ) {
            clockwise(car);
        }else {
            throw new RuntimeException("Command exception");
        }
    }

    public int getPositionX(Car car,CarPark carPark) {
        return car.getX();
    }

    public int getPositionY(Car car,CarPark carPark) {
        return car.getY();
    }

    public Orientation getOrientation(Car car,CarPark carPark) {
        return car.getOrientation();
    }

    private void checkForWard(Car car,CarPark carPark){

        if(NORTH == car.getOrientation()) {
            int y = car.getY() + 1;
            checkY(y, carPark);
            car.setY(y);
        } else if(EAST == car.getOrientation()) {
            int x = car.getX() + 1;
            checkX(x, carPark);
            car.setX(x);
        } else if(SOUTH == car.getOrientation()) {
            int y = car.getY() - 1 ;
            checkY(y, carPark);
            car.setY(y);
        } else if(WEST == car.getOrientation()) {
            int x = car.getX() - 1;
            checkX(x, carPark);
            car.setX(x);
        }
    }

    public void checkX(int x, CarPark cp) {
        if(x < 0 || x > cp.getLength()) throw new  RuntimeException("Exception ");
    }

    public void checkY(int y, CarPark cp) {
        if(y < 0 || y > cp.getWidth()) throw new RuntimeException("Exception ");
    }





    private void clockwise(Car car){
        int o = car.getOrientation().getValue();
        int cw = ++o % 4;
        car.setOrientation(
                Orientation.values()[cw]);
    }

    private void notClockwise(Car car){
        int o = car.getOrientation().getValue();
        int cw = (--o < 0 ? 4 + o: o) % 4;
        car.setOrientation(
                Orientation.values()[cw]);
    }

}
