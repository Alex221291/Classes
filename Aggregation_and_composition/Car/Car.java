package aggregation.car;

//2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
//менять колесо, вывести на консоль марку автомобиля.

public class Car {

    private String carModel;
    private Engine engine;
    private Wheel[] wheels;

    public Car(String carModel) {
        this.carModel = carModel;
        engine = new Engine();
        wheels = new Wheel[]{new Wheel(),new Wheel(),new Wheel(),new Wheel()};
    }

    public void go() {
        engine.go();
        for (Wheel wheel : wheels) wheel.go();
        System.out.println();
    }

    public void stop() {
        engine.stop();
        for (Wheel wheel : wheels) wheel.stop();
        System.out.println();
    }

    public void refuel() {
        System.out.println("Car is refueled\n");
    }

    public void swapWheel(int wheelNumber, Wheel wheel) {
        wheels[wheelNumber] = wheel;
        System.out.println("Wheel replaced\n");
    }

    public void printCarModel() {
        System.out.println("Car brand " + carModel + "\n");
    }
}

class Wheel {

    public void go() {
        System.out.println("Wheel turns");
    }

    public void stop() {
        System.out.println("Wheel doesn't turns");
    }
}

class Engine {

    void go() {
        System.out.println("Engine is running");
    }

    void stop() {
        System.out.println("Engine is not running");
    }
}

