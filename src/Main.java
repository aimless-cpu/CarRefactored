import com.company.Car;
import com.company.Engine;
import com.company.Producer;

public class Main {

    public static void main(String[] args) {

        Engine e1 = new Engine(150, Engine.TYPE.DIESEL);
        Producer p1 = new Producer(0.1, "Audi", "DE");
        Car c1 = new Car("green",229,50000, 0.1, 4, e1, p1);

        System.out.println("test");

        c1.getPriceDiscount();








	// write your code here
    }
}
