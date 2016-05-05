package objects.learning;

import java.util.Arrays;

/**
 * Created by goran on 5.5.2016.
 */
public class Cabin extends GeometricBody {
    private Window[] windows;

    public Cabin(int height, int width, Window[] windows) {
        super(height, width, 0);
        this.windows = windows;
    }

    @Override
    public String toString() {
        return "Cabin is space f0r passengers who have height of: " + getHeight() + " and width of: " + getWidth() +
                " \n Cabin also have windows " + Arrays.toString(windows) + " \n";
    }
}
