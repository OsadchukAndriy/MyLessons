package Patterns.Abstract_factory;

public class AbstractFactoryLesson {
    public static void main(String[] args) {
        Factory carFactory = new AbstractFactory().createFactory("Car");
        Factory tankFactory = new AbstractFactory().createFactory("Tank");
        Car toyota = carFactory.createCar("Toyota");
        Car audi = carFactory.createCar("Audi");
        Tank t91 = tankFactory.createTank("T91");
        Tank t92 = tankFactory.createTank("T92");
        toyota.drive();
        audi.drive();
        t91.drive();
        t92.drive();
    }
}

interface Car {
    void drive();
}
class Toyota implements Car {
    @Override
    public void drive() {
        System.out.println("drive Toyota");
    }
}
class Audi implements Car {
    @Override
    public void drive() {
        System.out.println("drive Audi");
    }
}
class CarFactory implements Factory {
    public Car createCar(String typeOfCar) {
        switch (typeOfCar) {
            case "Toyota":
                return new Toyota();
            case "Audi":
                return new Audi();
            default:
                return null;
        }
    }

    @Override
    public Tank createTank(String typeOfTank) {
        return null;
    }
}

interface Tank {
    void drive();
}
class T91 implements Tank {
    @Override
    public void drive() {
        System.out.println("drive T91");
    }
}
class T92 implements Tank {
    @Override
    public void drive() {
        System.out.println("drive T92");
    }
}
class TankFactory implements Factory {
    @Override
    public Car createCar(String typeOfCar) {
        return null;
    }

    public Tank createTank(String typeOfCar) {
        switch (typeOfCar) {
            case "T91":
                return new T91();
            case "T92":
                return new T92();
            default:
                return null;
        }
    }
}

interface Factory {
    Car createCar(String typeOfCar);

    Tank createTank(String typeOfTank);
}
class AbstractFactory {
    Factory createFactory(String typeOfFactory) {
        switch (typeOfFactory) {
            case "Car":
                return new CarFactory();
            case "Tank":
                return new TankFactory();
            default:
                return null;
        }
    }
}
