package objects.learning;

import java.util.Arrays;

/**
 * Created by goran on 5.5.2016.
 */
public class Wagon {
    private Wheel[] wheels;
    private Cabin cabin;
    private Platform platform;


    public Wagon(Wheel[] wheels, Cabin cabin, Platform platform) {
        this.wheels = wheels;
        this.cabin = cabin;
        this.platform = platform;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public Cabin getCabin() {
        return cabin;
    }

    public void setCabin(Cabin cabin) {
        this.cabin = cabin;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public Wagon[] getAndFillArrayOfWagons(int numberOfElements, Wagon wagon) {

        Wagon[] arrayOfWagon = new Wagon[numberOfElements];
        for (int i = 0; i < arrayOfWagon.length; i++) {
            arrayOfWagon[i] = wagon;
        }
        return arrayOfWagon;
    }

    @Override
    public String toString() {
        return "Wagon is made from platform: \n " + platform.toString() + " \n array of wheels: " + Arrays.toString(wheels) +
                "\n and cabin: " + cabin.toString() + " \n";
    }
}
