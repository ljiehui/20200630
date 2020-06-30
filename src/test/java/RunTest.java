import entity.Car;
import entity.CarPark;
import entity.Orientation;
import service.serviceImp.CarServiceImp;


/**
 * Created by Administrator on 2020/6/29.
 */
public class RunTest {


    public static void main(String[] args) {
        Car car = new Car(1,1, Orientation.EAST);
        CarPark carPark = new CarPark(1,4);
        CarServiceImp imp = new CarServiceImp();
        System.out.println(imp.getPositionX(car,carPark));
        System.out.println(imp.getPositionY(car,carPark));
        System.out.println(imp.getOrientation(car,carPark));

        imp.move("forward",car,carPark);
        System.out.println("------------------");
        System.out.println(imp.getPositionX(car,carPark));
        System.out.println(imp.getPositionY(car,carPark));
        System.out.println(imp.getOrientation(car,carPark));
    }

}
