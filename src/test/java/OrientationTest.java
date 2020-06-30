import entity.Orientation;

public class OrientationTest {
    public static void main(String[] args) {
        int o = 0;
        int cw  = (--o < 0 ? 4+ o: o) % 4;
        System.out.println(cw);
        System.out.println((0-1) %4);
        System.out.println(Orientation.values()[(2 )% 4]);
    }
}
