package aggregation.car;
//2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
//менять колесо, вывести на консоль марку автомобиля.
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Maserati");
        car.printCarModel();
        car.go();
        car.stop();
        car.refuel();
        car.swapWheel(1, new Wheel());
        car.go();
    }
} 

