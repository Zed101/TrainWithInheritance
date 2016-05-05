package objects.learning;

import java.util.Arrays;

/**
 * Created by goran on 5.5.2016.
 */
public class GeometricBody {
    private int height;
    private int width;
    private int diameter;

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public GeometricBody(int height, int width, int diameter) {
        this.height = height;
        this.width = width;
        this.diameter = diameter;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


}
