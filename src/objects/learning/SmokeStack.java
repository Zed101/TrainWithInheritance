package objects.learning;

/**
 * Created by goran on 5.5.2016.
 */
public class SmokeStack extends GeometricBody{
    public SmokeStack(int height, int width, int diameter) {
        super(height, width, diameter);
    }

    @Override
    public String toString() {
        return "Smokestack have height of: " + getHeight() + " width of: " + getWidth() + " and diameter of:  " + getDiameter() + "\n";
    }
}
