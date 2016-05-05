package objects.learning;

import java.util.Arrays;

/**
 * Created by goran on 5.5.2016.
 */
public class Window extends GeometricBody {

    public Window(int height, int width) {

        super(height, width,0);
    }


    public Window[] getAndFillArrayOfObject(int numberOfElements, Window window){

        Window[] arrayOfWindows = new Window[numberOfElements];
        for(int i = 0; i < arrayOfWindows.length; i++){
            arrayOfWindows[i] = window;
        }
        return arrayOfWindows;
    }

    @Override
    public String toString() {
        return "Window have standard measures height: " + getHeight() + " and width: " + getWidth();
    }
}
