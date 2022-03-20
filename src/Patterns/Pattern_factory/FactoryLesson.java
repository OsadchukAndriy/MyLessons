package Patterns.Pattern_factory;

public class FactoryLesson {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Car toyota = factory.create("Toyota");
        Car audi = factory.create("Audi");
       toyota.drive();
       audi.drive();
    }

}

interface Car{
    void drive();
}
class Toyota implements Car{

    @Override
    public void drive() {
        System.out.println("Drive Toyota");
    }
}

class Audi implements Car{
    @Override
    public void drive() {
        System.out.println("Drive Audi");
    }
}
class Factory{
    public Car create(String typeOrCar){
        switch (typeOrCar){
            case "Toyota" : return new Toyota();
            case "Audi" : return new Audi();
            default :return null;
        }
    }
}
