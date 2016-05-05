package objects.learning;

/**
 * Created by goran on 5.5.2016.
 */
public class Boiler extends GeometricBody {
    private int vapourLevel;

    public Boiler(int height, int width,  int vapourLevel) {
        super(height, width, 0);
        this.vapourLevel = vapourLevel;
    }

    public int getVapourLevel() {
        return vapourLevel;
    }

    public void setVapourLevel(int vapourLevel) {
        this.vapourLevel = vapourLevel;
    }

    @Override
    public String toString() {
        return "Boiler produces vapour who starts steam engine who need value of vapour in: " + vapourLevel + ". Height of boiler is: " +
                getHeight() + " and width is: " + getWidth() + " \n";
    }
}
