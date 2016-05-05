package objects.learning;

/**
 * Created by goran on 5.5.2016.
 */
public class Platform extends GeometricBody{
    public Platform(int height, int width) {
        super(height, width, 0);
    }

    @Override
    public String toString() {
        return "Platform is main part of train, all elements is set on platform. Platform have height of: \n" +
                getHeight() + " and width of: " + getWidth() + " \n";
    }
}
