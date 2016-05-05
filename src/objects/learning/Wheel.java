package objects.learning;

/**
 * Created by goran on 5.5.2016.
 */
public class Wheel extends GeometricBody{
    private String material;
    public Wheel( int diameter,String material) {
        super(0, 0, diameter);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Wheel[] getAndFillArrayOfWheels(int numberOfElements, Wheel wheel){

        Wheel[] arrayOfWheel = new Wheel[numberOfElements];
        for(int i = 0; i < arrayOfWheel.length; i++){
            arrayOfWheel[i] = wheel;
        }
        return arrayOfWheel;
    }

    @Override
    public String toString() {
        return "Wheel have diameter of: " + getDiameter() + " and it's made from: " + material + "\n";
    }
}
