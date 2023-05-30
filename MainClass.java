import java.util.List;
import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        List<Cat> cats=new ArrayList<Cat>();
        cats.add(new Cat("Barsik", 5));
        cats.add(new Cat("Sharik", 50));
        cats.add(new Cat("Persik", 70));
        cats.add(new Cat("Snejok", 40));
        cats.add(new Cat("Leopold", 10));
        Plate plate = new Plate(100);
        plate.info();
        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }
    }
}