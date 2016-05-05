package objects.learning;

import java.util.Arrays;

/**
 * Created by goran on 5.5.2016.
 */
public class Locomotive {
    private SmokeStack smokeStack;
    private  Wheel[] wheels;
    private Boiler boiler;
    private Platform platform;

    public Locomotive(SmokeStack smokeStack, Wheel[] wheels, Boiler boiler, Platform platform) {
        this.smokeStack = smokeStack;
        this.wheels = wheels;
        this.boiler = boiler;
        this.platform = platform;
    }

    public SmokeStack getSmokeStack() {
        return smokeStack;
    }

    public void setSmokeStack(SmokeStack smokeStack) {
        this.smokeStack = smokeStack;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public Boiler getBoiler() {
        return boiler;
    }

    public void setBoiler(Boiler boiler) {
        this.boiler = boiler;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    @Override
    public String toString() {
        return "Locomotive is made of smokestack: \n" + smokeStack.toString() + " wheels: \n" + Arrays.toString(wheels) + " boiler: \n" +
                boiler.toString() + " and platform: \n" + platform.toString() + " \n";
    }
}

