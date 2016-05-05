package objects.learning;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Wheel wheel = new Wheel(10,"Steel");
        Wheel[] arrayOfWheels = wheel.getAndFillArrayOfWheels(2,wheel);
        Window window = new Window(40,40);

        Window[] windows = window.getAndFillArrayOfObject(2,window);

        SmokeStack smokeStack = new SmokeStack(100,20,10);
        Boiler boiler = new Boiler(200,200,100);
        Platform platform = new Platform(300, 300);
        Cabin cabin = new Cabin(200,300,windows);
        Wagon wagon = new Wagon(arrayOfWheels,cabin,platform);
        Wagon[] wagons = wagon.getAndFillArrayOfWagons(1,wagon);
        Locomotive locomotive = new Locomotive(smokeStack, arrayOfWheels,boiler,platform);
        Train train = new Train(locomotive,wagons);

        System.out.println(train.toString());
    }
}
