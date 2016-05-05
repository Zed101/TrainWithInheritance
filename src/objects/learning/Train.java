package objects.learning;

import java.util.Arrays;

/**
 * Created by goran on 5.5.2016.
 */
public class Train  {
    private Locomotive locomotive;
    private Wagon[] wagons;

    public Train(Locomotive locomotive, Wagon[] wagons) {
        this.locomotive = locomotive;
        this.wagons = wagons;
    }

    public Locomotive getLocomotive() {
        return locomotive;
    }

    public void setLocomotive(Locomotive locomotive) {
        this.locomotive = locomotive;
    }

    public Wagon[] getWagons() {
        return wagons;
    }

    public void setWagons(Wagon[] wagons) {
        this.wagons = wagons;
    }



    @Override
    public String toString() {
        return "Train is made of locomotive: \n" + locomotive.toString() + "\n and wagons " + Arrays.toString(wagons) + " \n" ;
    }
}
